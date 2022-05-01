package com.hans.toyprojectback.jwt;

import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

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
public class JwtSecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

	private TokenProvider tokenProvider;
	
	public JwtSecurityConfig(TokenProvider tokenProvider) {
		this.tokenProvider = tokenProvider;
	}
	
	@Override
	public void configure(HttpSecurity builder) throws Exception {
		JwtFilter customFilter = new JwtFilter(tokenProvider);
		builder.addFilterBefore(customFilter, UsernamePasswordAuthenticationFilter.class);
	}
	
}
