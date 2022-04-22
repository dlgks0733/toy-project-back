package com.hans.toyprojectback.dto;

import java.time.LocalDateTime;
import java.util.Set;

import com.hans.toyprojectback.domain.Admin;
import com.hans.toyprojectback.domain.AdminRole;
import com.hans.toyprojectback.enums.YesOrNo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminDto {
	
	// TODO: DTO @NotEmpty 추가
	
	private Long adSeq;
	
	private Set<AdminRole> adminRoles;
	
	private String adId;
	
	private String adName;
	
	private String adPwd;
	
	private String adPhone;
	
	private String adTel;
	
	private String adEmail;
	
	private String adDept;
	
	private YesOrNo adUseYn;
	
	private String regId;
	
	private LocalDateTime regDt;
	
	private String chgId;
	
	private LocalDateTime chgDt;
	
	public static AdminDto toDto(Admin admin) {
		return AdminDto.builder()
				.adSeq(admin.getAdSeq())
//				.adminRoles(admin.getAdminRoles())
				.adId(admin.getAdId())
				.adName(admin.getAdName())
				.adPwd(admin.getAdPwd())
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
