package com.springboot.loginThymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.loginThymeleaf.dao.BillDAO;
import com.springboot.loginThymeleaf.entity.Bill;

@Service
public class BillService {
	@Autowired
	private BillDAO billDao;

		public List<Bill> listAll() {
			return billDao.findAll();

		}

		public void save(Bill bill) {
			billDao.save(bill);
		}

		public Bill get(long id) {
			return billDao.findById(id).get();
		}

		public void delete(long id) {
			billDao.deleteById(id);
		}
}


