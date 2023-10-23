package com.velocity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Bill;
import com.velocity.repository.BillRepository;
import com.velocity.service.BillService;

@Service
public class BillServiceImpl implements BillService {
     @Autowired
	private BillRepository billRepository;
	@Override
	public Bill saveBill(Bill bill) {
		return billRepository.save(bill);
	}

	@Override
	public List<Bill> getAllBill() {
		
		return billRepository.findAll();
	}

	@Override
	public Bill updateBill(Bill bill) {
		
		return billRepository.save(bill);
	}

	@Override
	public void getdeleteById(Integer id) {
		billRepository.deleteById(id);
		
	}

}
