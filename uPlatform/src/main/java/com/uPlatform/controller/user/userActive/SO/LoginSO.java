package com.uPlatform.controller.user.userActive.SO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uPlatform.controller.DTO.UserVO;
import com.uPlatform.controller.user.userActive.DAO.LoginDAO;

@RestController
@RequestMapping(value = "user")
public class LoginSO
{
	@Autowired
	LoginDAO loginDAO;

	@GetMapping(value = "/signup")
	public ResponseEntity<?> registerUser(@RequestBody UserVO userVO)
			throws Exception
	{
		if(loginDAO.registerUser(userVO))
		{
			return ResponseEntity.ok().body(userVO);
		}
		return ResponseEntity.badRequest().body(userVO);
	}
}
