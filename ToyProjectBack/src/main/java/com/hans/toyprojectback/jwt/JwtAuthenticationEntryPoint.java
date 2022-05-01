package com.hans.toyprojectback.jwt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/**
* @packageName : com.hans.toyprojectback.jwt 
* @fileName : JwtAuthenticationEntryPoint.java 
* @author : LEE HAN 
* @date : 2022.05.01 
* @description : 유효한 자격증명을 제공하지 않고 접근할 때 401 UNAUTHORIZED 에러 리턴
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.05.01 LEE HAN 최초 생성 
*/
@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
	}

}
