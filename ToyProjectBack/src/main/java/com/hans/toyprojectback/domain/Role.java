package com.hans.toyprojectback.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.hans.toyprojectback.dto.role.RoleCreateDTO;
import com.hans.toyprojectback.enums.YesOrNo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @packageName : com.hans.toyprojectback.domain
 * @fileName : Role.java
 * @author : LEE HAN
 * @date : 2022.04.20
 * @description : 역할 Entity
 *              =========================================================== DATE
 *              AUTHOR NOTE
 *              -----------------------------------------------------------
 *              2022.04.20 LEE HAN 최초 생성
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "role")
@Builder
public class Role extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_seq")
	private Long roleSeq;
	
	@OneToMany(mappedBy = "role", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private Set<AdminRole> adminRoles;

	@Column(name = "role_id", length = 36, nullable = false, unique = true)
	private String roleId;

	@Column(name = "role_name", length = 50, nullable = false)
	private String roleName;

	@Column(name = "role_use_yn", length = 1, nullable = false)
	@Enumerated(EnumType.STRING)
	private YesOrNo roleUseYn;

	@Column(name = "reg_id", length = 100, nullable = false)
	private String regId;

	@Column(name = "chg_id", length = 100, nullable = false)
	private String chgId;

	public static Role toEntity(RoleCreateDTO dto) {
		return Role.builder()
				.adminRoles(dto.getAdminRoles())
				.roleId(dto.getRoleId())
				.roleName(dto.getRoleName())
				.roleUseYn(dto.getRoleUseYn())
				.regId(dto.getRegId())
				.chgId(dto.getChgId())
				.build();
	}
	
}
