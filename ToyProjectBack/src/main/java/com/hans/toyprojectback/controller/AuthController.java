package com.hans.toyprojectback.controller;

import javax.validation.Valid;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hans.toyprojectback.dto.auth.LoginDTO;
import com.hans.toyprojectback.dto.auth.TokenDTO;
import com.hans.toyprojectback.jwt.JwtFilter;
import com.hans.toyprojectback.jwt.TokenProvider;

import lombok.RequiredArgsConstructor;

/**
* @packageName : com.hans.toyprojectback.controller 
* @fileName : AuthController.java 
* @author : LEE HAN 
* @date : 2022.05.03 
* @description : 
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.05.03 LEE HAN 최초 생성 
*/
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
	
	private final TokenProvider tokenProvider;
	private final AuthenticationManagerBuilder authenticationManagerBuilder;
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TokenDTO> authorize(@RequestBody @Valid LoginDTO dto) {
		UsernamePasswordAuthenticationToken authenticationToken
			= new UsernamePasswordAuthenticationToken(dto.getAdId(), dto.getAdPwd());
		
		Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
		String jwt = tokenProvider.createToken(authentication);
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add(JwtFilter.AUTHORIZATION_HEADER, "Bearer " + jwt);
		
		return new ResponseEntity<>(new TokenDTO(jwt, dto.getAdId()), httpHeaders, HttpStatus.OK);
	}

}
