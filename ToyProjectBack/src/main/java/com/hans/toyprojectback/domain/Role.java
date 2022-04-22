package com.hans.toyprojectback.domain;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.hans.toyprojectback.enums.YesOrNo;

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
@Entity
@Table(name = "role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_seq")
	private Long roleSeq;
	
	@OneToMany(mappedBy = "role", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private Set<AdminRole> adminRoles = new LinkedHashSet<>();

	@Column(name = "role_id", length = 36, nullable = false, unique = true)
	@NotNull
	@Size(max = 36)
	private String roleId;

	@Column(name = "role_name", length = 50, nullable = false)
	@NotNull
	@Size(max = 50)
	private String roleName;

	@Column(name = "role_use_yn", length = 1, nullable = false)
	@Enumerated(EnumType.STRING)
	@NotNull
	@Size(max = 1)
	private YesOrNo roleUseYn;

	@Column(name = "reg_id", length = 100, nullable = false)
	@NotNull
	@Size(max = 100)
	private String regId;

	@Column(name = "reg_dt", nullable = false)
	@CreatedDate
	@NotNull
	private LocalDateTime regDt;

	@Column(name = "chg_id", length = 100, nullable = false)
	@NotNull
	@Size(max = 100)
	private String chgId;

	@Column(name = "chg_dt", nullable = false)
	@LastModifiedDate
	@NotNull
	private LocalDateTime chg_dt;

	
}
