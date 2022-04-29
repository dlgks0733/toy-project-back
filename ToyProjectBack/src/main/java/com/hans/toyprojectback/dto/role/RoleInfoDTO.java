package com.hans.toyprojectback.dto.role;

import java.time.LocalDateTime;

import com.hans.toyprojectback.enums.YesOrNo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @packageName : com.hans.toyprojectback.dto.role 
* @fileName : RoleInfoDTO.java 
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
@Builder
public class RoleInfoDTO {
	
	private String roleId;
	
	private String roleName;
	
	private YesOrNo roleUseYn;
	
	private String regId;
	
	private LocalDateTime regDt;
	
	private String chgId;
	
	private LocalDateTime chgDt;
	
}
