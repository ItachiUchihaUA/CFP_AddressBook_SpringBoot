package com.example.demo.entities;

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
	
	
}
