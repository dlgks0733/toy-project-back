package com.hans.toyprojectback.dto.role;

import com.hans.toyprojectback.enums.YesOrNo;

import lombok.Data;

@Data
public class RoleSummaryInfoDTO {
	
    private String roleId;
	
	private String roleName;
	
	private YesOrNo roleUseYn;
	
}
