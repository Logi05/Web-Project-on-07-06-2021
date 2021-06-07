package com.springboot.loginThymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.loginThymeleaf.entity.Bill;
import com.springboot.loginThymeleaf.entity.Stock;
@Repository
public interface BillDAO extends JpaRepository<Bill,Long>{

}
