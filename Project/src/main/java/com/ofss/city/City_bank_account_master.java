package com.ofss.city;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class City_bank_account_master {

	@Id
	int accountNo;
	String accountName;
	LocalDate openingDate;
	String accountType;
	float  availableBalance;
	int customerId;
	
	
	public City_bank_account_master() {
		// TODO Auto-generated constructor stub
	}


	public City_bank_account_master(int accountNo, String accountName, LocalDate openingDate, String accountType,
			float availableBalance, int customerId) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.openingDate = openingDate;
		this.accountType = accountType;
		this.availableBalance = availableBalance;
		this.customerId = customerId;
	}


	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public LocalDate getOpeningDate() {
		return openingDate;
	}


	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public float getAvailableBalance() {
		return availableBalance;
	}


	public void setAvailableBalance(float availableBalance) {
		this.availableBalance = availableBalance;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	@Override
	public String toString() {
		return "City_bank_account_master [accountNo=" + accountNo + ", accountName=" + accountName + ", openingDate="
				+ openingDate + ", accountType=" + accountType + ", availableBalance=" + availableBalance
				+ ", customerId=" + customerId + "]";
	}

	
	
	
}
