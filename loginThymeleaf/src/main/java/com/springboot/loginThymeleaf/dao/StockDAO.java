package com.springboot.loginThymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.springboot.loginThymeleaf.entity.Stock;


@Repository
public interface StockDAO extends JpaRepository<Stock,Long>{		

}