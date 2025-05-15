package com.demo.ulms.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ulms.entities.Author;
import com.demo.ulms.entities.Book;
import com.demo.ulms.entities.BookLoan;
import com.demo.ulms.entities.LibraryMember;
import com.demo.ulms.entities.Reservation;
import com.demo.ulms.entities.repo.AuthorRepo;
import com.demo.ulms.services.SavingService;

@Service
public class SavingServiceImpl implements SavingService{

	@Autowired AuthorRepo authorRepo;
	
	@Override
	public String saveBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveAuthor(Author book) {
		authorRepo.save(book);
		return null;
	}

	@Override
	public String saveBookLoan(BookLoan book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveLibraryMember(LibraryMember book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveReservation(Reservation book) {
		// TODO Auto-generated method stub
		return null;
	}

}
