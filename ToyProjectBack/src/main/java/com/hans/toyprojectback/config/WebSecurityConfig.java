package com.hans.toyprojectback.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.hans.toyprojectback.jwt.JwtAccessDeniedHandler;
import com.hans.toyprojectback.jwt.JwtAuthenticationEntryPoint;
import com.hans.toyprojectback.jwt.JwtSecurityConfig;
import com.hans.toyprojectback.jwt.TokenProvider;

import lombok.RequiredArgsConstructor;

/**
* @packageName : com.hans.toyprojectback.config 
* @fileName : WebSecurityConfig.java 
* @author : LEE HAN 
* @date : 2022.04.26 
* @description : 
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.26 LEE HAN 최초 생성 
*/
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@RequiredArgsConstructor
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	private final TokenProvider tokenProvider;
	private final JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
	private final JwtAccessDeniedHandler jwtAccessDeniedHandler;
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			
			.exceptionHandling()
			.authenticationEntryPoint(jwtAuthenticationEntryPoint)
			.accessDeniedHandler(jwtAccessDeniedHandler) // 예외처리 지정
			
			.and()
			.sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.STATELESS) // 세션 미사용
			
			.and()
			.authorizeRequests()
			.antMatchers("/api/auth").permitAll()
			.anyRequest().authenticated() // API 호출 설정
			
			.and()
			.apply(new JwtSecurityConfig(tokenProvider)); // config 적용
	}
	
}
