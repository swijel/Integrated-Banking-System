package com.ofss.hdcc;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hdcc_bank_account_master {

	@Id
	 int AccNo;
	 String AccName;             
	 LocalDate OpDate;   
	 String AccType;   
	 Float AccBalance;    
	 int CustId;

	 
	public Hdcc_bank_account_master() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hdcc_bank_account_master(int accNo, String accName, LocalDate opDate, String accType, Float accBalance,
			int custId) {
		super();
		AccNo = accNo;
		AccName = accName;
		OpDate = opDate;
		AccType = accType;
		AccBalance = accBalance;
		CustId = custId;
	}

	public int getAccNo() {
		return AccNo;
	}

	public void setAccNo(int accNo) {
		AccNo = accNo;
	}

	public String getAccName() {
		return AccName;
	}

	public void setAccName(String accName) {
		AccName = accName;
	}

	public LocalDate getOpDate() {
		return OpDate;
	}

	public void setOpDate(LocalDate opDate) {
		OpDate = opDate;
	}

	public String getAccType() {
		return AccType;
	}

	public void setAccType(String accType) {
		AccType = accType;
	}

	public Float getAccBalance() {
		return AccBalance;
	}

	public void setAccBalance(Float accBalance) {
		AccBalance = accBalance;
	}

	public int getCustId() {
		return CustId;
	}

	public void setCustId(int custId) {
		CustId = custId;
	}

	@Override
	public String toString() {
		return "Infinty_bank_account_master [AccNo=" + AccNo + ", AccName=" + AccName + ", OpDate=" + OpDate + ", AccType="
				+ AccType + ", AccBalance=" + AccBalance + ", CustId=" + CustId + "]";
	}



}
