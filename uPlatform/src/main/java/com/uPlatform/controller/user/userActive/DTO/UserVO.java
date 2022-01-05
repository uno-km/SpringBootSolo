package com.uPlatform.controller.user.userActive.DTO;

import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class UserVO {
	String user_id;
	String user_password;
	String user_email;
	String user_name;
	String user_phoneNum;
	String user_auth;
	String user_birth;
}
