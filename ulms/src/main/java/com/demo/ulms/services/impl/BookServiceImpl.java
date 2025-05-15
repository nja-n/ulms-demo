package com.demo.ulms.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.demo.ulms.dtos.SearchParams;
import com.demo.ulms.entities.Author;
import com.demo.ulms.entities.Book;
import com.demo.ulms.entities.repo.AuthorRepo;
import com.demo.ulms.entities.repo.BooksRepo;
import com.demo.ulms.services.BookService;

@Service
public class BookServiceImpl implements BookService {
	@Autowired AuthorRepo authorRepo;
	@Autowired BooksRepo booksRepo;
	
	@Override
	public List<Book> findBooksByCustomFilter(SearchParams param) {
		if(param.getSize() == null || param.getSize()==0) {
			param.setSize(20);
		}
		Pageable pageable = PageRequest.of(param.getPage(), param.getSize());
		boolean isAvail = param.getAvailable();
		
		Page<Book> books = booksRepo.findAllBySearchParams(
				param.getIsbn(),//1
				param.getTitle(),//2
				param.getAuthorName(),//3
				param.getGenre(),//4
				param.getPublicationYearFrom(),//5
				param.getPublicationYearTo(),//6
				param.getPublisher(),//7
				isAvail,//8
				param.getLoanedByMemberId(),//9
				param.getReservedByMemberId(),//10
				pageable);
		return books.getContent();
	}

	@Override
	public List<Author> getAllAuthors() {
		return authorRepo.findAll();
	}

}
