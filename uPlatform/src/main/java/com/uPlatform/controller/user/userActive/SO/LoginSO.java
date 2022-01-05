package com.uPlatform.controller.user.userActive.SO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uPlatform.controller.user.userActive.DAO.LoginDAO;
import com.uPlatform.controller.user.userActive.DTO.UserVO;

@RestController
@RequestMapping(value = "user")
public class LoginSO {
	@Autowired
	LoginDAO loginDAO;

	@PostMapping(value = "/signup")
	public ResponseEntity<?> registerUser(@RequestBody UserVO userVO) throws Exception {
		if (loginDAO.registerUser(userVO)) {
			ResponseEntity.ok().body(userVO);
		}
		return ResponseEntity.badRequest().body(userVO);
	}
}
