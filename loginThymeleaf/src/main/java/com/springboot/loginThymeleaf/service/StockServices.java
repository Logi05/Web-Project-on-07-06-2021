package com.springboot.loginThymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springboot.loginThymeleaf.dao.StockDAO;
import com.springboot.loginThymeleaf.entity.Stock;


@Service
public class StockServices {
	@Autowired
    private StockDAO stockDAO;
	
	public List<Stock> listAll() {
        return stockDAO.findAll();
    }
     
    public void save(Stock stock) {
    	stockDAO.save(stock);
    }
     
    public Stock get(long id) {
        return stockDAO.findById(id).get();
    }
     
    public void delete(long id) {
    	stockDAO.deleteById(id);
    }

}
