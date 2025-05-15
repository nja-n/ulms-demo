package com.demo.ulms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ulms.dtos.SearchParams;
import com.demo.ulms.entities.Book;
import com.demo.ulms.services.BookService;

@RestController()
@RequestMapping("/v1")
public class AppController {
	
	@Autowired BookService bookService;

	@GetMapping("/")
	public ResponseEntity<?> getHome(){
		return new ResponseEntity<>("here is the home", HttpStatus.OK);
	}
	
	@GetMapping("/books/search")
	public ResponseEntity<?> saerchBook(SearchParams param){
		List<Book> books = bookService.findBooksByCustomFilter(param);
		return new ResponseEntity<>(books, HttpStatus.OK);
	}
}
