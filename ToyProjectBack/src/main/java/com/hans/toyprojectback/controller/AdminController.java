package com.hans.toyprojectback.controller;


import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hans.toyprojectback.dto.AdminDto;
import com.hans.toyprojectback.service.AdminService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/admin")
@Slf4j
public class AdminController {

	private final AdminService adminService;
	
	@PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AdminDto> register(@RequestBody AdminDto dto) {
		log.info("adminDTO::: " + dto);
		return ResponseEntity.ok(adminService.register(dto));
	}
	
}
