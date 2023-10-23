package com.velocity.service;

import java.util.List;

import com.velocity.model.Bill;

public interface BillService {
public Bill saveBill(Bill bill);
public List<Bill> getAllBill();
public Bill updateBill(Bill bill);
public void getdeleteById(Integer id);
}
