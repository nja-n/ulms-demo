package com.demo.ulms.dtos;

import lombok.Data;

@Data
public class SearchParams {

	String isbn;
	String title;
	String authorName;
	String genre;// enum needs
	Integer publicationYearFrom;
	Integer publicationYearTo;
	String publisher;
	Boolean available;
	String loanedByMemberId;
	String reservedByMemberId;
	Integer page;
	Integer size;
	String sort;
	
}
