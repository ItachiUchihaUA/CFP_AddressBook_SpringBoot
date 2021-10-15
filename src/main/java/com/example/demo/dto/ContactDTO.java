package com.example.demo.dto;

import lombok.Data;

@Data
public class ContactDTO {
	
	private String fName;
	private String lName;
	private String city;
	private String state;
	private long phone;
	private String email;
	
}
