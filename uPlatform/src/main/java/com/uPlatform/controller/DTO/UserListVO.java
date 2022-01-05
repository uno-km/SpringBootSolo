package com.uPlatform.controller.DTO;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class UserListVO {
	List<UserVO> UserListDTO;
}
