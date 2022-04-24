package com.hans.toyprojectback.dto.admin;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.hans.toyprojectback.domain.AdminRole;
import com.hans.toyprojectback.enums.YesOrNo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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
@NoArgsConstructor
@AllArgsConstructor
public class AdminCreateDTO {
	
	private Long adSeq;
	
	private Set<AdminRole> adminRoles;
	
	@NotNull
	@Size(min = 6, max = 100)
	private String adId;
	
	@NotNull
	@Size(min = 2, max = 50)
	private String adName;
	
	@NotNull
	@Size(min = 6 ,max = 100)
	private String adPwd;
	
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
	private String regId;
	
	@NotNull
	@Size(min = 6, max = 100)
	private String chgId;
	
}
