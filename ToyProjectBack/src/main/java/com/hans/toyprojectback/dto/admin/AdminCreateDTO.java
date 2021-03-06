package com.hans.toyprojectback.dto.admin;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hans.toyprojectback.domain.Admin;
import com.hans.toyprojectback.enums.YesOrNo;

import lombok.Data;


/**
* @packageName : com.hans.toyprojectback.dto.admin 
* @fileName : AdminCreateDTO.java 
* @author : LEE HAN 
* @date : 2022.04.24 
* @description : Admin 생성 DTO
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.24 LEE HAN 최초 생성 
*/
@Data
public class AdminCreateDTO {
	
	@NotNull
	@Size(min = 6, max = 100)
	private String adId;
	
	@NotNull
	@Size(min = 2, max = 50)
	private String adName;
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@NotNull
	@Size(min = 6 ,max = 100)
	private String adPwd;
	
	@NotNull
	@Size(min = 11, max = 20)
	private String adPhone;
	
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
	private String regId;
	
	@NotNull
	@Size(min = 6, max = 100)
	private String chgId;
	
	public Admin toEntity() {
		return Admin.builder()
				.adId(adId)
				.adName(adName)
				.adPwd(adPwd)
				.adPhone(adPhone)
				.adTel(adTel)
				.adEmail(adEmail)
				.adDept(adDept)
				.adUseYn(adUseYn)
				.regId(regId)
				.chgId(chgId)
				.build();
	}
	
}
