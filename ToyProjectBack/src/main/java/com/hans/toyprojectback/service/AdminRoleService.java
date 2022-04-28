package com.hans.toyprojectback.service;

import com.hans.toyprojectback.dto.admin.AdminInfoDTO;
import com.hans.toyprojectback.dto.adminrole.AdminRoleCreateDTO;

public interface AdminRoleService {

	public AdminInfoDTO create(AdminRoleCreateDTO dto);
	
}
