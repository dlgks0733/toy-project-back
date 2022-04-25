package com.hans.toyprojectback.service;

import com.hans.toyprojectback.dto.role.RoleCreateDTO;
import com.hans.toyprojectback.dto.role.RoleInfoDTO;

/**
* @packageName : com.hans.toyprojectback.service 
* @fileName : RoleService.java 
* @author : LEE HAN 
* @date : 2022.04.25 
* @description : Role Service
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.25 LEE HAN 최초 생성 
*/
public interface RoleService {
	
	/** 
	* @methodName : create 
	* @author : LEE HAN 
	* @date : 2022.04.25 
	* @param dto
	* @return 
	*/
	public RoleInfoDTO create(RoleCreateDTO dto);
	
}
