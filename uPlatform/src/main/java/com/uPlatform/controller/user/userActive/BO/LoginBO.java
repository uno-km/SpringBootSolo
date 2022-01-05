package com.uPlatform.controller.user.userActive.BO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uPlatform.controller.DTO.UserVO;
import com.uPlatform.controller.mappers.userActiveMapper;

@Service
public class LoginBO
{
	@Autowired
	userActiveMapper userActiveMapper;

	public boolean registerUser(UserVO userVO)
	{
		UserVO tempVO = userActiveMapper.getUserInfo(userVO);
		if(null == tempVO || tempVO.getUser_id().isEmpty())
		{
			userActiveMapper.signUp(userVO);
			return true;
		}
		return false;
	}
}
