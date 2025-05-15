package com.demo.ulms.entities;

import java.util.Date;

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
public class BookLoan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "book")
	private Book book;
	//not null
	
	@ManyToOne
	@JoinColumn(name = "member")
	private LibraryMember member;
	
	@Column(name = "loan_date")
	private Date loanDate;
	
	@Column(name = "due_date")
	private Date dueDate;
	
	@Column(name = "return_date")
	private Date returnDate;
	
	@Column(name = "status")
	private String status;
	//(Enum: ACTIVE, OVERDUE, RETURNED)
}
