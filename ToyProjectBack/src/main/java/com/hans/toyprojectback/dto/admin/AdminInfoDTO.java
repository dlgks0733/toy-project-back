package com.hans.toyprojectback.dto.admin;

import java.time.LocalDateTime;
import java.util.List;

import com.hans.toyprojectback.dto.role.RoleSummaryInfoDTO;
import com.hans.toyprojectback.enums.YesOrNo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
* @packageName : com.hans.toyprojectback.dto.admin 
* @fileName : AdminInfoDTO.java 
* @author : LEE HAN 
* @date : 2022.04.24 
* @description : Admin 정보 DTO
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.24 LEE HAN 최초 생성 
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminInfoDTO {
	
	private List<RoleSummaryInfoDTO> roleSummaryInfoList;
	
	private String adId;
	
	private String adName;
	
	private String adPhone;
	
	private String adTel;
	
	private String adEmail;
	
	private String adDept;
	
	private YesOrNo adUseYn;
	
	private String regId;
	
	private LocalDateTime regDt;
	
	private String chgId;
	
	private LocalDateTime chgDt;
}
