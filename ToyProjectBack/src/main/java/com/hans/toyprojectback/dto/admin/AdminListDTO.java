package com.hans.toyprojectback.dto.admin;

import com.hans.toyprojectback.enums.YesOrNo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @packageName : com.hans.toyprojectback.dto.admin 
* @fileName : AdminListDTO.java 
* @author : LEE HAN 
* @date : 2022.04.27 
* @description : 
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.27 LEE HAN 최초 생성 
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminListDTO {
	
	private String adId;
	
	private String adName;
	
	private String adDept;
	
	private YesOrNo adUseYn;
	
}
