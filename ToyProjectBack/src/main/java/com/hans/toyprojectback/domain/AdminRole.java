package com.hans.toyprojectback.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
* @packageName : com.hans.toyprojectback.domain 
* @fileName : AdminRole.java 
* @author : LEE HAN 
* @date : 2022.04.20 
* @description : 관리자역할 Entity (관리자와 역할의 관계체)
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.20 LEE HAN 최초 생성 
*/
@Getter
@NoArgsConstructor
@Entity
@Table(name = "admin_role")
public class AdminRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ad_role_seq")
	private Long adRoleSeq;
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ad_seq")
	private Admin admin;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "role_seq")
	private Role role;
	
}
