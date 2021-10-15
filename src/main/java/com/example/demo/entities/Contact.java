package com.example.demo.entities;

import com.example.demo.dto.ContactDTO;

import lombok.Data;

@Data
public class Contact {
	private int id;
	private String fName;
	private String lName;
	private String city;
	private String state;
	private long phone;
	private String email;
	
	public Contact(int id, ContactDTO contactDTO  ){
		this.id=id;
		this.fName=contactDTO.getFName();
		this.lName=contactDTO.getLName();
		this.city=contactDTO.getCity();
		this.state=contactDTO.getState();
		this.phone=contactDTO.getPhone();
		this.email=contactDTO.getEmail();
	}
	
}
