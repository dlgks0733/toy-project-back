package com.hans.toyprojectback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hans.toyprojectback.domain.Admin;


/**
* @packageName : com.hans.toyprojectback.repository 
* @fileName : AdminRepository.java 
* @author : LEE HAN 
* @date : 2022.04.24 
* @description : Admin Repository
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.24 LEE HAN 최초 생성 
*/
@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
