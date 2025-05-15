package com.demo.ulms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "isbn")
	private String isbn;
	// please add unique, not-null, pattern : ISBN-[0-9]{10,13} or standard ISBN regex

	@Column(name = "title")
	private String title;
	// add not null
	
	@Column(name = "genre")
	private String genre;
	//add genre setup
	//Enum: FICTION, SCIENCE, HISTORY, FANTASY, MYSTERY, BIOGRAPHY, TECHNOLOGY, TEXTBOOK
	
	@Column(name = "publication_year")
	private Integer publicationYear;
	
	@Column(name = "publisher")
	private String publisher;
	
	@Column(name = "total_copies")
	private Integer totalCopies = 1;

	@ManyToOne
	@JoinColumn(name = "author")
	private Author author;
}
