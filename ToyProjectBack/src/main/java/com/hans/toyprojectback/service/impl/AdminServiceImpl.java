package com.hans.toyprojectback.service.impl;

import javax.transaction.Transactional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hans.toyprojectback.domain.Admin;
import com.hans.toyprojectback.dto.admin.AdminCreateDTO;
import com.hans.toyprojectback.dto.admin.AdminInfoDTO;
import com.hans.toyprojectback.dto.admin.AdminUpdateDTO;
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
	
	private final PasswordEncoder passwordEncoder;
	
	@Override
	public AdminInfoDTO create(AdminCreateDTO dto) {
		String encodePwd = passwordEncoder.encode(dto.getAdPwd());
		dto.setAdPwd(encodePwd);
		log.info("Admin Service Create::: " + dto);
		return adminRepository.save(dto.toEntity()).toInfoDto();
	}

	@Override
	public AdminInfoDTO getInfoBySeq(Long seq) {
		log.info("Admin Service GetInfoBySeq::: " + seq);
		return adminRepository.findById(seq).orElseThrow(IllegalArgumentException::new).toInfoDto();
	}

	@Transactional
	@Override
	public AdminInfoDTO update(Long seq, AdminUpdateDTO dto) {
		Admin admin = adminRepository.findById(seq).orElseThrow(IllegalArgumentException::new);
		admin.update(dto.getAdPhone(), dto.getAdTel(), dto.getAdEmail(), dto.getAdDept(), dto.getAdUseYn(), dto.getChgId());
		return admin.toInfoDto();
	}	

}
