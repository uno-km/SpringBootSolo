package com.uPlatform.controller.user.userActive.DTO;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class UserListVO {
	List<UserVO> UserListDTO;
}
