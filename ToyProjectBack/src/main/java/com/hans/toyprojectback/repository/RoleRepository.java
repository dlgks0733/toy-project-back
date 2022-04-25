package com.hans.toyprojectback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hans.toyprojectback.domain.Role;

/**
* @packageName : com.hans.toyprojectback.repository 
* @fileName : RoleRepository.java 
* @author : LEE HAN 
* @date : 2022.04.25 
* @description : Role Repository
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.25 LEE HAN 최초 생성 
*/
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
