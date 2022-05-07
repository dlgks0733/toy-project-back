package com.hans.toyprojectback.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @packageName : com.hans.toyprojectback.dto.auth 
* @fileName : TokenDTO.java 
* @author : LEE HAN 
* @date : 2022.05.03 
* @description : 
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.05.03 LEE HAN 최초 생성 
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenDTO {
	
	private String token;
	private String adId;
	
}
