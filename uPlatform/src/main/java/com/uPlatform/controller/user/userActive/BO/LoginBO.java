package com.uPlatform.controller.user.userActive.BO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uPlatform.controller.mappers.userActiveMapper;
import com.uPlatform.controller.user.userActive.DTO.UserVO;

@Service
public class LoginBO {
	@Autowired
	userActiveMapper userActiveMapper;
	@Autowired
	UserVO outVO;

	public boolean registerUser(UserVO userVO) {
		/* 받아온 userVO로 쿼리문을 돌려 userVO */
		outVO = userActiveMapper.getUserInfo(userVO);
		if (!outVO.getUser_id().isEmpty()) {
			userActiveMapper.signUp(outVO);
			return false;
		}
		return true;
	}
}
