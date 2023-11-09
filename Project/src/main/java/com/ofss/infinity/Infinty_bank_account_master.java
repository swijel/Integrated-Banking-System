package com.ofss.infinity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Infinty_bank_account_master {

	@Id
	 int accNo;
	 String accName;             
	 LocalDate opDate;   
	 String accType;   
	 Float accBalance;    
	 int custId;

	 
	public Infinty_bank_account_master() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Infinty_bank_account_master(int accNo, String accName, LocalDate opDate, String accType, Float accBalance,
			int custId) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.opDate = opDate;
		this.accType = accType;
		this.accBalance = accBalance;
		this.custId = custId;
	}


	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public String getAccName() {
		return accName;
	}


	public void setAccName(String accName) {
		this.accName = accName;
	}


	public LocalDate getOpDate() {
		return opDate;
	}


	public void setOpDate(LocalDate opDate) {
		this.opDate = opDate;
	}


	public String getAccType() {
		return accType;
	}


	public void setAccType(String accType) {
		this.accType = accType;
	}


	public Float getAccBalance() {
		return accBalance;
	}


	public void setAccBalance(Float accBalance) {
		this.accBalance = accBalance;
	}


	public int getCustId() {
		return custId;
	}


	public void setCustId(int custId) {
		this.custId = custId;
	}


	@Override
	public String toString() {
		return "Infinty_bank_account_master [accNo=" + accNo + ", accName=" + accName + ", opDate=" + opDate
				+ ", accType=" + accType + ", accBalance=" + accBalance + ", custId=" + custId + "]";
	}

	



}
