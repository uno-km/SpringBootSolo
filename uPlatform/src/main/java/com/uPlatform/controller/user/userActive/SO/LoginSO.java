package com.uPlatform.controller.user.userActive.SO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uPlatform.controller.DTO.UserVO;
import com.uPlatform.controller.user.userActive.DAO.LoginDAO;
/*
 * ex)매서드이름:파라미터타입/리턴타입/설명 registerUser : UserVO(list)/userVO/정보를 DB에 저장시킨다. checkDuplId :
 * 
 */
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
	@PostMapping(value = "/checkid")
	public boolean checkDuplId(@RequestBody UserVO userVO)
	{
		return loginDAO.checkDuplId(userVO);
	}
	@PostMapping(value = "/signin")
	public boolean signinUser(@RequestBody UserVO userVO)
	{
		return loginDAO.signinUser(userVO);
	}

}
