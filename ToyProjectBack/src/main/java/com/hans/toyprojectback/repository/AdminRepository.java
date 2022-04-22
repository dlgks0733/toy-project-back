package com.hans.toyprojectback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hans.toyprojectback.domain.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
