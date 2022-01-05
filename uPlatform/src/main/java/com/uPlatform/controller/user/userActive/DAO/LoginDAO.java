package com.uPlatform.controller.user.userActive.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uPlatform.controller.user.userActive.BO.LoginBO;
import com.uPlatform.controller.user.userActive.DTO.UserVO;

@Service
public class LoginDAO {

	@Autowired
	LoginBO loginBO;

	public boolean registerUser(UserVO userVO) {
		return loginBO.registerUser(userVO);
	}
}
