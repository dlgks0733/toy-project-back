package com.hans.toyprojectback.controller;


import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hans.toyprojectback.dto.admin.AdminCreateDTO;
import com.hans.toyprojectback.dto.admin.AdminInfoDTO;
import com.hans.toyprojectback.service.AdminService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
* @packageName : com.hans.toyprojectback.controller 
* @fileName : AdminController.java 
* @author : LEE HAN 
* @date : 2022.04.24 
* @description : Admin Controller
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.24 LEE HAN 최초 생성 
*/
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/admin")
@Slf4j
public class AdminController {

	private final AdminService adminService;
	
	@PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AdminInfoDTO> create(@RequestBody @Valid AdminCreateDTO dto) {
		log.info("Admin Controller Create::: " + dto);
		return ResponseEntity.ok(adminService.create(dto));
	}
	
}
