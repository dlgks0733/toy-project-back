package com.hans.toyprojectback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hans.toyprojectback.domain.AdminRole;

@Repository
public interface AdminRoleRepository extends JpaRepository<AdminRole, Long> {

}
