package com.itvedant.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itvedant.bank.dao.AddBankDAO;
import com.itvedant.bank.dao.UpdateBankDAO;
import com.itvedant.bank.service.BankService;

@Controller
@RequestMapping("/banks")
public class bankController {

	@Autowired
	BankService bankService;
	
	@PostMapping("")
	public ResponseEntity<?> create(@RequestBody AddBankDAO addBankDAO){
		return ResponseEntity.ok(this.bankService.createBank(addBankDAO));
	}

	@GetMapping("")
	public ResponseEntity<?> readAll(){
		return ResponseEntity.ok(this.bankService.readAllBank());
	}
	
	@GetMapping("/{acc_no}")
	public ResponseEntity<?> findbyId(@PathVariable Integer acc_no){
		return ResponseEntity.ok(this.bankService.findByID(acc_no));
	}
	
	@PutMapping("/{acc_no}")
	public ResponseEntity<?> updateAll(@RequestBody UpdateBankDAO updateBankDAO, @PathVariable Integer acc_no){
		return ResponseEntity.ok(this.bankService.updateBank(updateBankDAO, acc_no));
	}
	
	@DeleteMapping("/{acc_no}")
	public ResponseEntity<?> deletebank(@PathVariable Integer acc_no){
		return ResponseEntity.ok(this.bankService.deleteBank(acc_no));
	}
}
