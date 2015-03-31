package com.example.servletjspdemo.repo.impl;

import java.util.List;

import com.example.servletjspdemo.repo.IRepoArchive;
import com.example.servletjspdemo.repo.impl.modelRepoArchive;
import com.example.servletjspdemo.domain.UserAddress;

public class addAddress {

	private IRepoArchive database = new modelRepoArchive();

	public void add(UserAddress address){
		UserAddress newAddress = new UserAddress(address.getUsername(), address.getAddressType(), address.getProvince(), address.getCity(), address.getPostcode(), address.getStreet(), address.getHousenr());
		database.getUserAddresses().save(newAddress);
	}
	
	public List<UserAddress> getAllAddresses(){
		return database.getUserAddresses().getAll();
	}
	
	public UserAddress getAddress(String name){
		return database.getUserAddresses().withName(name);
	}
	
}
