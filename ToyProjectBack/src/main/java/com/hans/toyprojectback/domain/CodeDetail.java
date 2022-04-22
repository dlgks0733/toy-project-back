package com.hans.toyprojectback.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
* @packageName : com.hans.toyprojectback.domain 
* @fileName : CodeDetail.java 
* @author : LEE HAN 
* @date : 2022.04.21 
* @description : 코드상세 Entity
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.21 LEE HAN 최초 생성 
*/
@Getter
@NoArgsConstructor
@Entity
@Table(name = "code_detail")
public class CodeDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_dtl_seq")
	private Long cdDtlSeq;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "cd_grp_seq")
	private CodeGroup codeGroup;
	
	@Column(name = "cd_dtl_id", length = 36, nullable = false, unique = true)
	@NotNull
	@Size(max = 36)
	private String cdDtlId;
	
	@Column(name = "cd_dtl_name", length = 50, nullable = false)
	@NotNull
	@Size(max = 50)
	private String cdDtlName;
	
	@Column(name = "cd_dtl_ord", nullable = false)
	@NotNull
	private int cdDtlOrd;
	
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
	@NotNull
	@LastModifiedDate
	private LocalDateTime chg_dt;
	
}
