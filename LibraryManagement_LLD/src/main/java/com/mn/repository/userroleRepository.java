package com.mn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mn.model.UserRole;

public interface userroleRepository extends JpaRepository<UserRole, Integer> {

}
