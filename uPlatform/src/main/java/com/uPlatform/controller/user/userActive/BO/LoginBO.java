package com.uPlatform.controller.user.userActive.BO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uPlatform.controller.DTO.UserVO;
import com.uPlatform.controller.mappers.userActiveMapper;
import com.uPlatform.unoCode.Validation;

@Service
public class LoginBO
{
	@Autowired
	userActiveMapper userActiveMapper;

	public boolean registerUser(UserVO userVO)
	{
		UserVO tempVO = userActiveMapper.getUserInfo(userVO);
		if(Validation.isNullCheck(tempVO))
		{
			userActiveMapper.signUp(userVO);
			return true;
		}
		return false;
	}
	public boolean checkDuplId(String input)
	{
		int res = userActiveMapper.checkDuplicationId(input);
		if(res > 0)
		{
			return false;
		}
		return true;
	}
}
