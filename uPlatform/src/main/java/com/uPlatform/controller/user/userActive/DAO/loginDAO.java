package com.uPlatform.controller.user.userActive.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uPlatform.controller.user.userActive.BO.loginBO;

@Service
public class loginDAO {

	@Autowired
	loginBO loginBO;

	public String getTime() {
		return loginBO.getTime();
	}

}
