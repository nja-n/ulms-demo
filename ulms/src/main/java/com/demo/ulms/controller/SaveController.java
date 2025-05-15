package com.demo.ulms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.ulms.entities.Author;
import com.demo.ulms.entities.Book;
import com.demo.ulms.entities.BookLoan;
import com.demo.ulms.entities.LibraryMember;
import com.demo.ulms.entities.Reservation;
import com.demo.ulms.services.BookService;
import com.demo.ulms.services.SavingService;

@Controller
@RequestMapping("/save")
public class SaveController {
	
	@Autowired SavingService savingService;
	@Autowired BookService bookService;
	
	@GetMapping("/")
	public String getHome(){
		return "pages/author";
	}
	
	@GetMapping("/book")
	public ModelAndView getBook() {
		ModelAndView view = new ModelAndView();
		view.addObject("authers", bookService.getAllAuthors());
		view.setViewName("pages/book");
		return view;
	}
	@PostMapping("/book")
	public String saveBook(Book book) {
		savingService.saveBook(book);
		return "redirect:book";
	}
	
	@GetMapping("/author")
	public ModelAndView getauthor() {
		ModelAndView view = new ModelAndView();
		view.setViewName("pages/author");
		return view;
	}
	@PostMapping("/author")
	public String saveAuthor(Author book) {
		savingService.saveAuthor(book);
		return "redirect:author";
	}
	@PostMapping("/loan")
	public String saveBookLoan(BookLoan book) {
		return savingService.saveBookLoan(book);
	}
	@PostMapping("/member")
	public String saveMmember(LibraryMember book) {
		return savingService.saveLibraryMember(book);
	}
	@PostMapping("/reserve")
	public String saveReserve(Reservation book) {
		return savingService.saveReservation(book);
	}
}
