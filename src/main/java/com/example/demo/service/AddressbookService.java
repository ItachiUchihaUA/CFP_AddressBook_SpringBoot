package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Contact;

@Service
public class AddressbookService {
	List<Contact> addressbookList = new ArrayList<Contact>(); 
	
	public Contact getById(int id) {
		return addressbookList.get(id-1);
	}
	
	public List<Contact> getAll(){
		return addressbookList;
	}

	public List<Contact> add(Contact contact){
		addressbookList.add(contact);
		return addressbookList;
	}
	
	public List<Contact> update(int id, Contact contact){
		addressbookList.remove(id-1);
		addressbookList.add(contact);
		return addressbookList;
	}
	
	public List<Contact> delete(int id){
		addressbookList.remove(id);
		return addressbookList;
	}
}
