package com.hans.toyprojectback.domain;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.NoArgsConstructor;


/**
* @packageName : com.hans.toyprojectback.domain 
* @fileName : CodeGroup.java 
* @author : LEE HAN 
* @date : 2022.04.21 
* @description : 코드그룹 Entity
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.21 LEE HAN 최초 생성 
*/
@Getter
@NoArgsConstructor
@Entity
@Table(name = "code_group")
public class CodeGroup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_grp_seq")
	private Long cdGrpSeq;
	
	@OneToMany(mappedBy = "codeGroup", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	private Set<CodeDetail> codeDetails = new LinkedHashSet<>();
	
	@Column(name = "cd_grp_id", length = 36, nullable = false, unique = true)
	private String cdGrpId;
	
	@Column(name = "cd_grp_name", length = 50, nullable = false)
	private String cdGrpName;
	
	@Column(name = "reg_id", length = 100, nullable = false)
	private String regId;
	
	@Column(name = "reg_dt", nullable = false)
	@CreatedDate
	private LocalDateTime regDt;
	
	@Column(name = "chg_id", length = 100, nullable = false)
	private String chgId;
	
	@Column(name = "chg_dt", nullable = false)
	@LastModifiedDate
	private LocalDateTime chg_dt;

}
