package com.example.servletjspdemo.repo.impl;

import com.example.servletjspdemo.domain.*;
import com.example.servletjspdemo.repo.*;

public class modelRepoArchive implements IRepoArchive{

	private modelDatabase database = new modelDatabase();
	

	
	public IUserAddressRepo getUserAddresses(){
		return new modelUserAddressRepo(database);
	}
	
}
