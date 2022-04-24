package com.hans.toyprojectback.dto.admin;

import java.time.LocalDateTime;
import java.util.Set;

import com.hans.toyprojectback.domain.Admin;
import com.hans.toyprojectback.domain.AdminRole;
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
	
	private Set<AdminRole> adminRoles;
	
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
	
	public static AdminInfoDTO toDto(Admin admin) {
		return AdminInfoDTO.builder()
//				.adminRoles(admin.getAdminRoles())
				.adId(admin.getAdId())
				.adName(admin.getAdName())
				.adPhone(admin.getAdPhone())
				.adTel(admin.getAdTel())
				.adEmail(admin.getAdEmail())
				.adDept(admin.getAdDept())
				.adUseYn(admin.getAdUseYn())
				.regId(admin.getRegId())
				.regDt(admin.getRegDt())
				.chgId(admin.getChgId())
				.chgDt(admin.getChgDt())
				.build();
	}
}
