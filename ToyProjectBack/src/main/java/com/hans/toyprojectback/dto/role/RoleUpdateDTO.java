package com.hans.toyprojectback.dto.role;

import javax.validation.constraints.Size;

import com.hans.toyprojectback.enums.YesOrNo;
import com.sun.istack.NotNull;

import lombok.Data;

/**
* @packageName : com.hans.toyprojectback.dto.role 
* @fileName : RoleUpdateDTO.java 
* @author : LEE HAN 
* @date : 2022.04.27 
* @description : 
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.27 LEE HAN 최초 생성 
*/
@Data
public class RoleUpdateDTO {
	
	@NotNull
	@Size(min = 2, max = 36)
	private String roleId;
	
	@NotNull
	@Size(min = 2, max = 50)
	private String roleName;
	
	@NotNull
	private YesOrNo roleUseYn;
	
}
