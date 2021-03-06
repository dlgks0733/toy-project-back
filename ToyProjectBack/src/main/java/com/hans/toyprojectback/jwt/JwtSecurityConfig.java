package com.hans.toyprojectback.jwt;

import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import lombok.RequiredArgsConstructor;

/**
* @packageName : com.hans.toyprojectback.jwt 
* @fileName : JwtSecurityConfig.java 
* @author : LEE HAN 
* @date : 2022.05.01 
* @description : Custom JWT Filter를 Security 로직에 적용
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.05.01 LEE HAN 최초 생성 
*/
@RequiredArgsConstructor
public class JwtSecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

	private final TokenProvider tokenProvider;
	
	@Override
	public void configure(HttpSecurity builder) throws Exception {
		JwtFilter customFilter = new JwtFilter(tokenProvider);
		builder.addFilterBefore(customFilter, UsernamePasswordAuthenticationFilter.class);
	}
	
}
