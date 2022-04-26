package com.hans.toyprojectback.controller;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hans.toyprojectback.dto.role.RoleCreateDTO;
import com.hans.toyprojectback.dto.role.RoleInfoDTO;
import com.hans.toyprojectback.service.RoleService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
* @packageName : com.hans.toyprojectback.controller 
* @fileName : RoleController.java 
* @author : LEE HAN 
* @date : 2022.04.26 
* @description : 
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.26 LEE HAN 최초 생성 
*/
@RestController
@RequestMapping("/api/role")
@RequiredArgsConstructor
@Slf4j
public class RoleController {
	
	private final RoleService roleService;
	
	/** 
	* @methodName : create 
	* @author : LEE HAN 
	* @date : 2022.04.26 
	* @param dto
	* @return 
	*/
	@PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RoleInfoDTO> create(@RequestBody @Valid RoleCreateDTO dto) {
		log.info("Role Create::: " + dto);
		return ResponseEntity.ok(roleService.create(dto));
	}
	
}
