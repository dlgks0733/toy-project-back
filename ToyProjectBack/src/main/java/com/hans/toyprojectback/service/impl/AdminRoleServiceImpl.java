package com.hans.toyprojectback.service.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.hans.toyprojectback.domain.Admin;
import com.hans.toyprojectback.domain.AdminRole;
import com.hans.toyprojectback.domain.Role;
import com.hans.toyprojectback.dto.admin.AdminInfoDTO;
import com.hans.toyprojectback.dto.adminrole.AdminRoleCreateDTO;
import com.hans.toyprojectback.repository.AdminRepository;
import com.hans.toyprojectback.repository.AdminRoleRepository;
import com.hans.toyprojectback.repository.RoleRepository;
import com.hans.toyprojectback.service.AdminRoleService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class AdminRoleServiceImpl implements AdminRoleService {
	
	private final AdminRoleRepository adminRoleRepository;
	
	private final AdminRepository adminRepository;
	
	private final RoleRepository roleRepository;
	
	@Transactional
	@Override
	public AdminInfoDTO create(AdminRoleCreateDTO dto) {
		log.info("AdminRole Service Create::: " + dto);
		
		Admin admin = adminRepository.findById(dto.getAdSeq()).orElseThrow(IllegalArgumentException::new);
		dto.getRoleSeqList().forEach((seq) -> {
			Role role = roleRepository.findById(seq).orElseThrow(IllegalArgumentException::new);
			AdminRole adminRole = AdminRole.builder()
					.admin(admin)
					.role(role)
					.build();
			
			adminRoleRepository.save(adminRole);
		});;
		
		
		return admin.toInfoDto();
	}

}
