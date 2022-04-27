package com.hans.toyprojectback.service.impl;

import org.springframework.stereotype.Service;

import com.hans.toyprojectback.dto.role.RoleCreateDTO;
import com.hans.toyprojectback.dto.role.RoleInfoDTO;
import com.hans.toyprojectback.repository.RoleRepository;
import com.hans.toyprojectback.service.RoleService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class RoleServiceImpl implements RoleService {

	private final RoleRepository roleRepository;
	
	@Override
	public RoleInfoDTO create(RoleCreateDTO dto) {
		log.info("Role Service Create::: " + dto);
		return roleRepository.save(dto.toEntity()).toInfoDto();
	}

}
