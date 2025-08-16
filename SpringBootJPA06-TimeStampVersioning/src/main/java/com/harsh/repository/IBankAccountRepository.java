package com.harsh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.entity.BankAccount;


public interface IBankAccountRepository extends JpaRepository<BankAccount, Long> {

}
