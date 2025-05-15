package com.demo.ulms.entities.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.ulms.entities.Book;


public interface BooksRepo extends JpaRepository<Book, Long> {

	@Query("select b from Book b "
			+ "where (?1 is null or b.isbn = ?1) "
			+ "and (?2 is null or b.title like %?2%) "
			+ "and (?3 is null or b.author.name like %?3%) "
			+ "and (?4 is null or b.genre = ?4) ")
	//needs to update with all queries
	Page<Book> findAllBySearchParams(String string, String string2, String string3, String string4, Integer integer, Integer integer2, String string5, boolean isAvail, String string6, String string7, Pageable pageable);

}