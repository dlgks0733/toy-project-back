package com.hans.toyprojectback.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.hans.toyprojectback.domain.Admin;
import com.hans.toyprojectback.enums.YesOrNo;
import com.hans.toyprojectback.repository.AdminRepository;

import lombok.RequiredArgsConstructor;

/**
* @packageName : com.hans.toyprojectback.service.impl 
* @fileName : CustomUserDetailsService.java 
* @author : LEE HAN 
* @date : 2022.05.03 
* @description : Security UserDetailsService Impl
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.05.03 LEE HAN 최초 생성 
*/
@Component("userDetailsService")
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

	private final AdminRepository adminRepository;
	
	@Override
	public UserDetails loadUserByUsername(final String adId) throws UsernameNotFoundException {
		return adminRepository.findOneByAdId(adId).map(admin -> createUser(adId, admin))
				.orElseThrow(() -> new UsernameNotFoundException(adId + " -> 데이터베이스에서 찾을 수 없습니다."));
	}
	
	private User createUser(String adId, Admin admin) {
		if(admin.getAdUseYn().equals(YesOrNo.N)) {
			throw new RuntimeException(adId + " -> 활성화되어 있지 않습니다.");
		}
		
		List<GrantedAuthority> grantedAuthorities = admin.getAdminRoles().stream()
				.map(adminRole -> new SimpleGrantedAuthority(adminRole.getRole().getRoleId()))
				.collect(Collectors.toList());
		
		return new User(admin.getAdId(), admin.getAdPwd(), grantedAuthorities);
	}

}
