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
	public boolean signinUser(UserVO userVO)
	{
		UserVO tempVO = userActiveMapper.getUserInfo(userVO);
		if(Validation.isNullCheck(tempVO))
		{
			return false;
		}
		if(!tempVO.getUser_id().equals(userVO.getUser_id()))
		{
			return false;
		}
		if(!tempVO.getUser_password().equals(userVO.getUser_password()))
		{
			return false;
		}
		return true;
	}

	public boolean checkDuplId(UserVO userVO)
	{
		if(userActiveMapper.checkDuplicationId(userVO) == 0)
		{
			return true;
		}
		return false;
	}
}
