package com.uPlatform.controller.user.userActive.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uPlatform.controller.DTO.UserVO;
import com.uPlatform.controller.user.userActive.BO.LoginBO;
import com.uPlatform.unoCode.VALIDATIONTOOL;

@Service
public class LoginDAO
{

	@Autowired
	LoginBO loginBO;

	public boolean registerUser(UserVO userVO)
	{
		/* id에 특수문자가 들어오면 false를 반납해버림 */
		if(!VALIDATIONTOOL.ValidateIDCheck(userVO.getUser_id()))
		{
			return false;
		}
		return loginBO.registerUser(userVO);
	}
}
