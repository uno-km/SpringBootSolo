package com.uPlatform.controller.user.userActive.BO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uPlatform.controller.mappers.testMapper;

@Service
public class loginBO {
	@Autowired
	testMapper testMapper;

	public String getTime() {
		return testMapper.getTime();
	}
}
