package com.velocity.restcontroller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Bill;
import com.velocity.service.BillService;

@RestController
public class BillController {
	@Autowired
	private BillService billService;

	@PostMapping("/saveBill")
	public ResponseEntity<Bill> saveBill(@RequestBody Bill bill) {
		Date date = Date.valueOf(LocalDate.now().plusDays(30));
		bill.setDueDate(date);
		Date date1 = Date.valueOf(LocalDate.now());
		bill.setCreatedDate(date1);
		Bill bil = billService.saveBill(bill);

		return new ResponseEntity<>(bil, HttpStatus.CREATED);
	}

	@GetMapping("/getBill")
	public ResponseEntity<List<Bill>> getBill() {
		List<Bill> list = billService.getAllBill();
		return new ResponseEntity<List<Bill>>(list, HttpStatus.OK);
	}

	@PutMapping("/updateBill")
	public ResponseEntity<Bill> updateBill(@RequestBody Bill bill) {
		Bill bill1 = billService.updateBill(bill);
		return new ResponseEntity<Bill>(bill1, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Bill> deleteById(@PathVariable("id") Integer id) {
		billService.getdeleteById(id);
		return new ResponseEntity<Bill>(HttpStatus.OK);
	}
}
