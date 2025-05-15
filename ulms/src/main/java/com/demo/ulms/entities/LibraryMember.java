package com.demo.ulms.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class LibraryMember {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "member_id")
	private String memberId;
	//unique, not null, pattern: MEM-[A-Z0-9]{6}
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_ame")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	//unique, not null, valid email format
	
	@Column(name = "membership_date")
	private Date membershipDate;
	
	@Column(name = "status")
	private String status;
	//Enum: ACTIVE, INACTIVE, SUSPENDED
}
