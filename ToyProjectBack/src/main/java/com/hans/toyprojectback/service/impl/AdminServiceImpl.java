package com.hans.toyprojectback.service.impl;

import org.springframework.stereotype.Service;

import com.hans.toyprojectback.domain.Admin;
import com.hans.toyprojectback.dto.admin.AdminCreateDTO;
import com.hans.toyprojectback.dto.admin.AdminInfoDTO;
import com.hans.toyprojectback.repository.AdminRepository;
import com.hans.toyprojectback.service.AdminService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


/**
* @packageName : com.hans.toyprojectback.service.impl 
* @fileName : AdminServiceImpl.java 
* @author : LEE HAN 
* @date : 2022.04.24 
* @description : Admin Service 구현
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.24 LEE HAN 최초 생성 
*/
@Service
@RequiredArgsConstructor
@Slf4j
public class AdminServiceImpl implements AdminService {
	
	private final AdminRepository adminRepository;
	
	@Override
	public AdminInfoDTO create(AdminCreateDTO dto) {
		log.info("Admin Service Create::: " + dto);
		return AdminInfoDTO.toDto(adminRepository.save(Admin.toEntity(dto)));
	}

}
