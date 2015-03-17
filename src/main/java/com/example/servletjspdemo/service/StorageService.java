package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletjspdemo.domain.User;

public class StorageService {
	
	private List<User> db = new ArrayList<User>();
	
	public void add(User user){
		User newUser = new User();
		db.add(user);
	}
	
	public List<User> getAllUsers(){
		return db;
	}

}
