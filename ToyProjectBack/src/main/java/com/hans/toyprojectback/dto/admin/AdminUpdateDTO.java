package com.hans.toyprojectback.dto.admin;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.hans.toyprojectback.enums.YesOrNo;

import lombok.Data;

/**
* @packageName : com.hans.toyprojectback.dto.admin 
* @fileName : AdminUpdateDTO.java 
* @author : LEE HAN 
* @date : 2022.04.27 
* @description : 
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.27 LEE HAN 최초 생성 
*/
@Data
public class AdminUpdateDTO {
	
	@NotNull
	@Size(min = 11, max = 20)
	private String adPhone;
	
	@Size(min = 10, max = 20)
	private String adTel;
	
	@NotNull
	@Size(max = 100)
	@Email
	private String adEmail;
	
	@NotNull
	@Size(min = 2, max = 40)
	private String adDept;
	
	@NotNull
	private YesOrNo adUseYn;
	
	@NotNull
	@Size(min = 6, max = 100)
	private String chgId;
	
}
