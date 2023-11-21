package com.mn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mn.model.UserTransaction;

public interface userTransactionRepository extends JpaRepository<UserTransaction, Integer> {

}
