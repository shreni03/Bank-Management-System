package com.itvedant.bank.dao;

public class UpdateBankDAO {

	private String customer_name;
	private Float balance;
	private Boolean status;
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public Float getBalance() {
		return balance;
	}
	public void setBalance(Float balance) {
		this.balance = balance;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "UpdateBankDAO [customer_name=" + customer_name + ", balance=" + balance + ", status=" + status + "]";
	}
	
	
	
}
