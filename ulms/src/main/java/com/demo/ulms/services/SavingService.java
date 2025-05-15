package com.demo.ulms.services;

import com.demo.ulms.entities.Author;
import com.demo.ulms.entities.Book;
import com.demo.ulms.entities.BookLoan;
import com.demo.ulms.entities.LibraryMember;
import com.demo.ulms.entities.Reservation;

public interface SavingService {

	String saveBook(Book book);

	String saveAuthor(Author book);

	String saveBookLoan(BookLoan book);

	String saveLibraryMember(LibraryMember book);

	String saveReservation(Reservation book);

}
