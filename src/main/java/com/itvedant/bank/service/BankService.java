package com.itvedant.bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itvedant.bank.dao.AddBankDAO;
import com.itvedant.bank.dao.UpdateBankDAO;
import com.itvedant.bank.entity.Bank;
import com.itvedant.bank.repository.bankRepository;

@Service
public class BankService {

	@Autowired
	bankRepository bankRepository;
	
	public Bank createBank(AddBankDAO addBankDAO) {
		
		Bank bank = new Bank();
		
		bank.setCustomer_name(addBankDAO.getCustomer_name());
		bank.setBalance(addBankDAO.getBalance());
		bank.setStatus(addBankDAO.getStatus());
		
		this.bankRepository.save(bank);
		
		return bank;
	}
	
	public List<Bank> readAllBank(){
		
		List<Bank> bank = new ArrayList<Bank>();
		
		bank =  this.bankRepository.findAll();
		
		return bank;
	}
	
	public Bank findByID(Integer acc_no) {
		
		Bank bank = new Bank();
		
		bank = this.bankRepository.findById(acc_no).orElse(null);
		
		return bank;
		
	}
	
	public Bank updateBank(UpdateBankDAO updateBankDAO, Integer acc_no) {
		
		Bank bank = new Bank();
		
		this.bankRepository.findById(acc_no);
		
		if(updateBankDAO.getCustomer_name() != null) {
			bank.setCustomer_name(updateBankDAO.getCustomer_name());
		}
		if(updateBankDAO.getBalance() != null) {
			bank.setBalance(updateBankDAO.getBalance());
		}
		if(updateBankDAO.getStatus() != null) {
			bank.setStatus(updateBankDAO.getStatus());
		}
		
		bank = this.bankRepository.save(bank);
		
		return bank;
	}
	
	public String deleteBank(Integer acc_no) {
		
		this.bankRepository.deleteById(acc_no);
		
		return "Bank data deleted";
	}
}
