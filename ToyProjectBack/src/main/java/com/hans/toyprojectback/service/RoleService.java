package com.hans.toyprojectback.service;

import java.util.List;

import com.hans.toyprojectback.dto.role.RoleCreateDTO;
import com.hans.toyprojectback.dto.role.RoleInfoDTO;
import com.hans.toyprojectback.dto.role.RoleListDTO;
import com.hans.toyprojectback.dto.role.RoleUpdateDTO;

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

	/** 
	* @methodName : getInfoBySeq 
	* @author : LEE HAN 
	* @date : 2022.04.27 
	* @param seq
	* @return 
	*/
	public RoleInfoDTO getInfoBySeq(Long seq);
	
	/** 
	* @methodName : getList 
	* @author : LEE HAN 
	* @date : 2022.04.27 
	* @return 
	*/
	public List<RoleListDTO> getList();
	
	/** 
	* @methodName : update 
	* @author : LEE HAN 
	* @date : 2022.04.27 
	* @return 
	*/
	public RoleInfoDTO update(Long seq, RoleUpdateDTO dto);
	
}
