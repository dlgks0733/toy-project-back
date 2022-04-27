package com.hans.toyprojectback.service;

import com.hans.toyprojectback.dto.admin.AdminCreateDTO;
import com.hans.toyprojectback.dto.admin.AdminInfoDTO;
import com.hans.toyprojectback.dto.admin.AdminUpdateDTO;

/**
* @packageName : com.hans.toyprojectback.service 
* @fileName : AdminService.java 
* @author : LEE HAN 
* @date : 2022.04.24 
* @description : Admin Service
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.24 LEE HAN 최초 생성 
*/
public interface AdminService {
	
	
	/** 
	* @methodName : create 
	* @author : LEE HAN 
	* @date : 2022.04.24 
	* @param AdminCreateDTO
	* @return AdminDto
	*/
	public AdminInfoDTO create(AdminCreateDTO dto);
	
	/** 
	* @methodName : getInfoBySeq 
	* @author : LEE HAN 
	* @date : 2022.04.27 
	* @param seq
	* @return 
	*/
	public AdminInfoDTO getInfoBySeq(Long seq);
	
	/** 
	* @methodName : update 
	* @author : LEE HAN 
	* @date : 2022.04.27 
	* @param dto
	* @return 
	*/
	public AdminInfoDTO update(Long seq, AdminUpdateDTO dto);
}
