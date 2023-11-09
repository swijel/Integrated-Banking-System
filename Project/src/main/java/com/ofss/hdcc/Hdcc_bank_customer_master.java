package com.ofss.hdcc;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Hdcc_bank_customer_master {

	@Id
	int custId;
	String custName;
	String custPanNumber;
	String custAadhaarNumber;
	String custEkycNumber;
	
	public Hdcc_bank_customer_master() {
		// TODO Auto-generated constructor stub
	}

	public Hdcc_bank_customer_master(int custId, String custName, String custPanNumber, String custAadhaarNumber,
			String custEkycNumber) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custPanNumber = custPanNumber;
		this.custAadhaarNumber = custAadhaarNumber;
		this.custEkycNumber = custEkycNumber;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustPanNumber() {
		return custPanNumber;
	}

	public void setCustPanNumber(String custPanNumber) {
		this.custPanNumber = custPanNumber;
	}

	public String getCustAadhaarNumber() {
		return custAadhaarNumber;
	}

	public void setCustAadhaarNumber(String custAadhaarNumber) {
		this.custAadhaarNumber = custAadhaarNumber;
	}

	public String getCustEkycNumber() {
		return custEkycNumber;
	}

	public void setCustEkycNumber(String custEkycNumber) {
		this.custEkycNumber = custEkycNumber;
	}

	@Override
	public String toString() {
		return "Infinity_bank_customer_master [custId=" + custId + ", custName=" + custName + ", custPanNumber="
				+ custPanNumber + ", custAadhaarNumber=" + custAadhaarNumber + ", custEkycNumber=" + custEkycNumber
				+ "]";
	}

	
}
