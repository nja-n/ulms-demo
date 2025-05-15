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
public class Reservation {
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
	
	@Column(name = "reservation_date")
	private Date reservationDate;
	
	@Column(name = "pickup_expiry_date")
	private Date pickupExpiryDate;
	
	@Column(name = "status")
	private String status;
	//(Enum: PENDING, READY_FOR_PICKUP, FULFILLED, CANCELED)
}
