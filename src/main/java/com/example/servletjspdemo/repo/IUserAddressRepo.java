package com.example.servletjspdemo.repo;

import com.example.servletjspdemo.domain.UserAddress;

public interface IUserAddressRepo extends IRepo<UserAddress> {

	public UserAddress withName(String name);
	
}
