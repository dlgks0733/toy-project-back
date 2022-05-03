package com.hans.toyprojectback.dto.auth;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
* @packageName : com.hans.toyprojectback.dto.auth 
* @fileName : LoginDTO.java 
* @author : LEE HAN 
* @date : 2022.05.03 
* @description : 
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.05.03 LEE HAN 최초 생성 
*/
@Data
public class LoginDTO {

	@NotNull
	@Size(min = 6, max = 100)
	private String adId;
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@NotNull
	@Size(min = 6 ,max = 100)
	private String adPwd;
	
}
