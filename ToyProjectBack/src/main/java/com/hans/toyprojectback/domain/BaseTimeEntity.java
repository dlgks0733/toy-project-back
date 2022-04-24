package com.hans.toyprojectback.domain;

import java.time.LocalDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;


/**
* @packageName : com.hans.toyprojectback.domain 
* @fileName : BaseTimeEntity.java 
* @author : LEE HAN 
* @date : 2022.04.24 
* @description : 생성 및 수정 Date Time 자동화 Entity
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.24 LEE HAN 최초 생성 
*/
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {
	
	@CreatedDate
	private LocalDateTime regDt;
	
	@LastModifiedDate
	private LocalDateTime chgDt;

}
