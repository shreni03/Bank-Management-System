package com.itvedant.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itvedant.bank.entity.Bank;

@Repository
public interface bankRepository extends JpaRepository<Bank, Integer> {

}
