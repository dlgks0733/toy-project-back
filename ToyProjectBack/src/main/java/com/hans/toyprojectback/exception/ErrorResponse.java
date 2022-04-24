package com.hans.toyprojectback.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
* @packageName : com.hans.toyprojectback.exception 
* @fileName : ErrorResponse.java 
* @author : LEE HAN 
* @date : 2022.04.24 
* @description : Error 응답 객체
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.24 LEE HAN 최초 생성 
*/
@Getter
@AllArgsConstructor
public class ErrorResponse {
	private LocalDateTime timestamp;
	private String filed;
	private String message;
	private Object rejectedValue;
}
