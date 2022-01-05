package com.uPlatform.controller.user.userActive.SO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.uPlatform.controller.user.userActive.DAO.loginDAO;

@RestController
public class loginSO {
	@Autowired
	loginDAO loginDAO;

	@RequestMapping(value = "test")
	public @ResponseBody String testMyBatis(ModelMap medel) throws Exception {
		return loginDAO.getTime();
	}
}
