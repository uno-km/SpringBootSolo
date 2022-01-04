package com.uPlatform.controller.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uPlatform.controller.mappers.testMapper;

@Service
public class loginServiceImpl implements loginService {
	@Autowired
	testMapper testMapper;

	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return testMapper.getTime();
	}

}
