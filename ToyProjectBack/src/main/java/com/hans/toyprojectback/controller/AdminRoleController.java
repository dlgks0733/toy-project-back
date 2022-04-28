package com.hans.toyprojectback.controller;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hans.toyprojectback.dto.admin.AdminInfoDTO;
import com.hans.toyprojectback.dto.adminrole.AdminRoleCreateDTO;
import com.hans.toyprojectback.service.AdminRoleService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/admin-role")
@RequiredArgsConstructor
@Slf4j
public class AdminRoleController {
	
	private final AdminRoleService adminRoleService;
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AdminInfoDTO> create(@RequestBody @Valid AdminRoleCreateDTO dto) {
		log.info("AdminRole Controller Create::: " + dto);
		AdminInfoDTO adminInfoDTO = adminRoleService.create(dto);
		return ResponseEntity.ok(adminInfoDTO);
	}
	
}
