package com.hans.toyprojectback.dto.role;

import java.util.Set;

import javax.validation.constraints.Size;

import com.hans.toyprojectback.domain.AdminRole;
import com.hans.toyprojectback.enums.YesOrNo;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @packageName : com.hans.toyprojectback.dto.role 
* @fileName : RoleCreateDTO.java 
* @author : LEE HAN 
* @date : 2022.04.25 
* @description : 
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.25 LEE HAN 최초 생성 
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleCreateDTO {
	
	private Set<AdminRole> adminRoles;
	
	@NotNull
	@Size(min = 2, max = 36)
	private String roleId;
	
	@NotNull
	@Size(min = 2, max = 50)
	private String roleName;
	
	@NotNull
	private YesOrNo roleUseYn;
	
	@NotNull
	@Size(min = 6, max = 100)
	private String regId;
	
	@NotNull
	@Size(min = 6, max = 100)
	private String chgId;
}
