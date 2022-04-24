package com.hans.toyprojectback.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.hans.toyprojectback.dto.admin.AdminCreateDTO;
import com.hans.toyprojectback.enums.YesOrNo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
* @packageName : com.hans.toyprojectback.domain 
* @fileName : Admin.java 
* @author : LEE HAN 
* @date : 2022.04.20 
* @description : 관리자 Entity
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.20 LEE HAN 최초 생성 
*/
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "admin")
@Builder
public class Admin extends BaseTimeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ad_seq")
	private Long adSeq;
	
	//TODO: role 등록 구현 후에 adminRole 테스트
//	@OneToMany(mappedBy = "admin", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
//	private Set<AdminRole> adminRoles;
	
	@Column(name = "ad_id", length = 100, nullable = false, unique = true)
	private String adId;
	
	@Column(name = "ad_name", length = 50, nullable = false)
	private String adName;
	
	@Column(name = "ad_pwd", length = 100, nullable = false)
	private String adPwd;
	
	@Column(name = "ad_phone", length = 20, nullable = false)
	private String adPhone;
	
	@Column(name = "ad_tel", length = 20)
	private String adTel;
	
	@Column(name = "ad_email", length = 100, nullable = false)
	private String adEmail;
	
	@Column(name = "ad_dept", length = 40, nullable = false)
	private String adDept;
	
	@Column(name = "ad_use_yn", length = 1, nullable = false)
	@Enumerated(EnumType.STRING)
	private YesOrNo adUseYn;
	
	@Column(name = "reg_id", length = 100, nullable = false)
	private String regId;
	
	@Column(name = "reg_dt", nullable = false)
	@CreatedDate
	private LocalDateTime regDt;
	
	@Column(name = "chg_id", length = 100, nullable = false)
	private String chgId;
	
	@Column(name = "chg_dt", nullable = false)
	@LastModifiedDate
	private LocalDateTime chgDt;
	
	public static Admin toEntity(AdminCreateDTO dto) {
		return Admin.builder()
				.adSeq(dto.getAdSeq())
//				.adminRoles(dto.getAdminRoles())
				.adId(dto.getAdId())
				.adName(dto.getAdName())
				.adPwd(dto.getAdPwd())
				.adPhone(dto.getAdPhone())
				.adTel(dto.getAdTel())
				.adEmail(dto.getAdEmail())
				.adDept(dto.getAdDept())
				.adUseYn(dto.getAdUseYn())
				.regId(dto.getRegId())
				.chgId(dto.getChgId())
				.build();
	}
	
}
