package com.uPlatform.controller.user.SO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.uPlatform.controller.user.service.loginServiceImpl;

@RestController
public class loginSO {
	@Autowired
	loginServiceImpl loginServiceImpl;

//	@GetMapping
//	public String testController() {
//		return "Hello world";
//	}

	@RequestMapping(value = "test")
	public @ResponseBody String testMyBatis(ModelMap medel) throws Exception {
		return loginServiceImpl.getTime();
	}
}
