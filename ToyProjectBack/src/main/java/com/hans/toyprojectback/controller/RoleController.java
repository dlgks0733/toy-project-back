package com.hans.toyprojectback.controller;

import java.util.List;

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

import com.hans.toyprojectback.dto.role.RoleCreateDTO;
import com.hans.toyprojectback.dto.role.RoleInfoDTO;
import com.hans.toyprojectback.dto.role.RoleListDTO;
import com.hans.toyprojectback.dto.role.RoleUpdateDTO;
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
		log.info("Role Controller Create::: " + dto);
		return ResponseEntity.ok(roleService.create(dto));
	}
	
	/** 
	* @methodName : getInfoBySeq 
	* @author : LEE HAN 
	* @date : 2022.04.27 
	* @param seq
	* @return 
	*/
	@GetMapping(value = "/info/{seq}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RoleInfoDTO> getInfoBySeq(@PathVariable(name = "seq") Long seq) {
		log.info("Role Controller GetInfoBySeq::: " + seq);
		return ResponseEntity.ok(roleService.getInfoBySeq(seq));
	}
	
	/** 
	* @methodName : getList 
	* @author : LEE HAN 
	* @date : 2022.04.27 
	* @return 
	*/
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RoleListDTO>> getList() {
		log.info("Role Controller GetList::: ");
		return ResponseEntity.ok(roleService.getList());
	}
	
	/** 
	* @methodName : update 
	* @author : LEE HAN 
	* @date : 2022.04.27 
	* @param seq
	* @param dto
	* @return 
	*/
	@PutMapping(value = "/update/{seq}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RoleInfoDTO> update(@PathVariable(name = "seq") Long seq, @RequestBody @Valid RoleUpdateDTO dto) {
		log.info("Role Controller Update::: " + dto);
		return ResponseEntity.ok(roleService.update(seq, dto));
	}
	
}
