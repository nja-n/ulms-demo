package com.demo.ulms.services;

import java.util.List;

import com.demo.ulms.dtos.SearchParams;
import com.demo.ulms.entities.Author;
import com.demo.ulms.entities.Book;

public interface BookService {

	List<Book> findBooksByCustomFilter(SearchParams param);

	List<Author> getAllAuthors();

}
