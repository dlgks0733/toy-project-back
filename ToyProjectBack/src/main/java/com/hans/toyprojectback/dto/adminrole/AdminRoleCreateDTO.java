package com.hans.toyprojectback.dto.adminrole;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class AdminRoleCreateDTO {
	
	@NotNull
	private Long adSeq;
	
	@NotNull
	private List<Long> roleSeqList;
	
}
