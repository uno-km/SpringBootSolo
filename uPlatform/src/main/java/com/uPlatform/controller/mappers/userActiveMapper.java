package com.uPlatform.controller.mappers;

import org.apache.ibatis.annotations.Mapper;

import com.uPlatform.controller.user.userActive.DTO.UserVO;

@Mapper
public interface userActiveMapper {
	public UserVO getUserInfo(UserVO userVO);

	public void signUp(UserVO userVO);
}
