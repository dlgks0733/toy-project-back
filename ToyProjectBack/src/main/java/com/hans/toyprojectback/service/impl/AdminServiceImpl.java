package com.hans.toyprojectback.service.impl;

import org.springframework.stereotype.Service;

import com.hans.toyprojectback.domain.Admin;
import com.hans.toyprojectback.dto.AdminDto;
import com.hans.toyprojectback.repository.AdminRepository;
import com.hans.toyprojectback.service.AdminService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class AdminServiceImpl implements AdminService {
	
	private final AdminRepository adminRepository;
	
	@Override
	public AdminDto register(AdminDto dto) {
		log.info("Service AdminDTO::: " + dto);
		return AdminDto.toDto(adminRepository.save(Admin.toEntity(dto)));
	}

}
