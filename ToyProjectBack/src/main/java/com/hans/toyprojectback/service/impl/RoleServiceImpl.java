package com.hans.toyprojectback.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.hans.toyprojectback.domain.Role;
import com.hans.toyprojectback.dto.role.RoleCreateDTO;
import com.hans.toyprojectback.dto.role.RoleInfoDTO;
import com.hans.toyprojectback.dto.role.RoleListDTO;
import com.hans.toyprojectback.dto.role.RoleUpdateDTO;
import com.hans.toyprojectback.repository.RoleRepository;
import com.hans.toyprojectback.service.RoleService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class RoleServiceImpl implements RoleService {

	private final RoleRepository roleRepository;
	
	@Transactional
	@Override
	public RoleInfoDTO create(RoleCreateDTO dto) {
		log.info("Role Service Create::: " + dto);
		return roleRepository.save(dto.toEntity()).toInfoDto();
	}

	@Override
	public RoleInfoDTO getInfoBySeq(Long seq) {
		log.info("Role Service GetInfoBySeq::: " + seq);
		return roleRepository.findById(seq).orElseThrow(IllegalArgumentException::new).toInfoDto();
	}

	@Override
	public List<RoleListDTO> getList() {
		log.info("Role Service GetList::: ");
		return roleRepository.findAll().stream().map(Role::toListDto).collect(Collectors.toList());
	}

	@Transactional
	@Override
	public RoleInfoDTO update(Long seq, RoleUpdateDTO dto) {
		log.info("Role Service Update::: " + seq);
		Role role = roleRepository.findById(seq).orElseThrow(IllegalArgumentException::new);
		role.update(dto.getRoleId(), dto.getRoleName(), dto.getRoleUseYn());
		return role.toInfoDto();
	}

}
