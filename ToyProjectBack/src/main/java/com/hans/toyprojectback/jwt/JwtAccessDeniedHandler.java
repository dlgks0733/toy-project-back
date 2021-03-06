package com.hans.toyprojectback.jwt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

/**
* @packageName : com.hans.toyprojectback.jwt 
* @fileName : JwtAccessDeniedHandler.java 
* @author : LEE HAN 
* @date : 2022.05.01 
* @description : 필요한 권한이 존재하지 않은 경우 403 FORBIDDEN 에러 리턴
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.05.01 LEE HAN 최초 생성 
*/
@Component
public class JwtAccessDeniedHandler implements AccessDeniedHandler {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		response.sendError(HttpServletResponse.SC_FORBIDDEN);
	}

}
