package com.hans.toyprojectback.dto.role;

import java.time.LocalDateTime;
import java.util.Set;

import com.hans.toyprojectback.domain.AdminRole;
import com.hans.toyprojectback.domain.Role;
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
	
	private Set<AdminRole> adminRoles;
	
	private String roleId;
	
	private String roleName;
	
	private YesOrNo roleUseYn;
	
	private String regId;
	
	private LocalDateTime regDt;
	
	private String chgId;
	
	private LocalDateTime chgDt;
	
	public static RoleInfoDTO toDto(Role role) {
		return RoleInfoDTO.builder()
				.adminRoles(role.getAdminRoles())
				.roleId(role.getRoleId())
				.roleName(role.getRoleName())
				.roleUseYn(role.getRoleUseYn())
				.regId(role.getRegId())
				.regDt(role.getRegDt())
				.chgId(role.getChgId())
				.chgDt(role.getChgDt())
				.build();
	}
	
}
