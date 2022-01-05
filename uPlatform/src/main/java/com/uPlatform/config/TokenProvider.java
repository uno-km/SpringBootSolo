package com.uPlatform.config;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.uPlatform.controller.user.userActive.DTO.UserVO;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenProvider {
	private static final String SECRET_KEY = "NMA8JPctFunna59f5";

	public String create(UserVO userVO) {
		Date expiryDate = Date.from(Instant.now().plus(1, ChronoUnit.DAYS));

		return Jwts.builder().signWith(SignatureAlgorithm.HS512, SECRET_KEY).setSubject(userVO.getUser_id())
				.setIssuer("uPlatform app").setExpiration(expiryDate).compact();

	}

	public String validateAndGetUserId(String token) {
		Claims claims = Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
		return claims.getSubject();
	}
}
