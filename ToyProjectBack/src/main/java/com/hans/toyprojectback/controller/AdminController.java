package com.hans.toyprojectback.controller;


import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hans.toyprojectback.dto.admin.AdminCreateDTO;
import com.hans.toyprojectback.dto.admin.AdminInfoDTO;
import com.hans.toyprojectback.dto.admin.AdminUpdateDTO;
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
	
	/** 
	* @methodName : create 
	* @author : LEE HAN 
	* @date : 2022.04.25 
	* @param dto
	* @return 
	*/
	@PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AdminInfoDTO> create(@RequestBody @Valid AdminCreateDTO dto) {
		log.info("Admin Controller Create");
		return ResponseEntity.ok(adminService.create(dto));
	}
	
	/** 
	* @methodName : getInfoBySeq 
	* @author : LEE HAN 
	* @date : 2022.04.27 
	* @param seq
	* @return 
	*/
	@GetMapping(value = "/info/{seq}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AdminInfoDTO> getInfoBySeq(@PathVariable(name = "seq") Long seq) {
		log.info("Admin Controller GetInfoBySeq::: " + seq);
		return ResponseEntity.ok(adminService.getInfoBySeq(seq));
	}
	
	/** 
	* @methodName : update 
	* @author : LEE HAN 
	* @date : 2022.04.27 
	* @param dto
	* @return 
	*/
	@PutMapping(value = "/update/{seq}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AdminInfoDTO> update(@PathVariable("seq") Long seq, @RequestBody @Valid AdminUpdateDTO dto) {
		log.info("Admin Controller Update::: " + dto);
		return ResponseEntity.ok(adminService.update(seq, dto));
	}
	
}
