package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Contact;

@RestController
public class AddressbookController {
	
	@GetMapping("/{id}")
	public ResponseEntity<String> getById( @PathVariable("id") int id ){
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<String> getAll(){
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<String> add(@RequestBody Contact contact){
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<String> update(@RequestBody Contact contact, @PathVariable("id") int id){
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@RequestBody Contact contact, @PathVariable("id") int id){
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
