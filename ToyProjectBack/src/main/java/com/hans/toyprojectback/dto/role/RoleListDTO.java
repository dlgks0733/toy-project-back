package com.hans.toyprojectback.dto.role;

import com.hans.toyprojectback.enums.YesOrNo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @packageName : com.hans.toyprojectback.dto.role 
* @fileName : RoleListDTO.java 
* @author : LEE HAN 
* @date : 2022.04.27 
* @description : 
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.27 LEE HAN 최초 생성 
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleListDTO {
	
	private String roleId;
	
	private String roleName;
	
	private YesOrNo roleUseYn;
	
}
