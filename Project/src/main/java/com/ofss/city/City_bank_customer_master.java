package com.ofss.city;

import java.time.LocalDate;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class City_bank_customer_master {

	@Id
	private int customerId;
	private String customerName;
	private String customerPermanentAddress;
	private String customerCurrentAddress;
	private String customerMobile;
	private String customerEmail;
	private String customerOccupation;
	private LocalDate customerDob;
	private String customerPanNumber;
	private String customerAadhaarNumber;
	private String customerPassportNumber;
	private String customerEkycNumber;
	private String userId;
	private String customerPhoto;
	
	
	public City_bank_customer_master(int customerId, String customerName, String customerPermanentAddress,
			String customerCurrentAddress, String customerMobile, String customerEmail, String customerOccupation,
			LocalDate customerDob, String customerPanNumber, String customerAadhaarNumber,
			String customerPassportNumber, String customerEkycNumber, String userId, String customerPhoto) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPermanentAddress = customerPermanentAddress;
		this.customerCurrentAddress = customerCurrentAddress;
		this.customerMobile = customerMobile;
		this.customerEmail = customerEmail;
		this.customerOccupation = customerOccupation;
		this.customerDob = customerDob;
		this.customerPanNumber = customerPanNumber;
		this.customerAadhaarNumber = customerAadhaarNumber;
		this.customerPassportNumber = customerPassportNumber;
		this.customerEkycNumber = customerEkycNumber;
		this.userId = userId;
		this.customerPhoto = customerPhoto;
	}


	public String getCustomerPhoto() {
		return customerPhoto;
	}


	public void setCustomerPhoto(String customerPhoto) {
		this.customerPhoto = customerPhoto;
	}


	public City_bank_customer_master() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor ....");
	}


	public City_bank_customer_master(int customerId, String customerName, String customerPermanentAddress,
			String customerCurrentAddress, String customerMobile, String customerEmail, String customerOccupation,
			LocalDate customerDob, String customerPanNumber, String customerAadhaarNumber,
			String customerPassportNumber, String customerEkycNumber, String userId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPermanentAddress = customerPermanentAddress;
		this.customerCurrentAddress = customerCurrentAddress;
		this.customerMobile = customerMobile;
		this.customerEmail = customerEmail;
		this.customerOccupation = customerOccupation;
		this.customerDob = customerDob;
		this.customerPanNumber = customerPanNumber;
		this.customerAadhaarNumber = customerAadhaarNumber;
		this.customerPassportNumber = customerPassportNumber;
		this.customerEkycNumber = customerEkycNumber;
		this.userId = userId;
	}


	public int getCustomerId() {
		return customerId;
	}

	@Id
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerPermanentAddress() {
		return customerPermanentAddress;
	}


	public void setCustomerPermanentAddress(String customerPermanentAddress) {
		this.customerPermanentAddress = customerPermanentAddress;
	}


	public String getCustomerCurrentAddress() {
		return customerCurrentAddress;
	}


	public void setCustomerCurrentAddress(String customerCurrentAddress) {
		this.customerCurrentAddress = customerCurrentAddress;
	}


	public String getCustomerMobile() {
		return customerMobile;
	}


	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}


	public String getCustomerEmail() {
		return customerEmail;
	}


	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}


	public String getCustomerOccupation() {
		return customerOccupation;
	}


	public void setCustomerOccupation(String customerOccupation) {
		this.customerOccupation = customerOccupation;
	}


	public LocalDate getCustomerDob() {
		return customerDob;
	}


	public void setCustomerDob(LocalDate customerDob) {
		this.customerDob = customerDob;
	}


	public String getCustomerPanNumber() {
		return customerPanNumber;
	}


	public void setCustomerPanNumber(String customerPanNumber) {
		this.customerPanNumber = customerPanNumber;
	}


	public String getCustomerAadhaarNumber() {
		return customerAadhaarNumber;
	}


	public void setCustomerAadhaarNumber(String customerAadhaarNumber) {
		this.customerAadhaarNumber = customerAadhaarNumber;
	}


	public String getCustomerPassportNumber() {
		return customerPassportNumber;
	}


	public void setCustomerPassportNumber(String customerPassportNumber) {
		this.customerPassportNumber = customerPassportNumber;
	}


	public String getCustomerEkycNumber() {
		return customerEkycNumber;
	}


	public void setCustomerEkycNumber(String customerEkycNumber) {
		this.customerEkycNumber = customerEkycNumber;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	@Override
	public String toString() {
		return "City_bank_customer_master [customerId=" + customerId + ", customerName=" + customerName
				+ ", customerPermanentAddress=" + customerPermanentAddress + ", customerCurrentAddress="
				+ customerCurrentAddress + ", customerMobile=" + customerMobile + ", customerEmail=" + customerEmail
				+ ", customerOccupation=" + customerOccupation + ", customerDob=" + customerDob + ", customerPanNumber="
				+ customerPanNumber + ", customerAadhaarNumber=" + customerAadhaarNumber + ", customerPassportNumber="
				+ customerPassportNumber + ", customerEkycNumber=" + customerEkycNumber + ", userId=" + userId
				+ ", customerPhoto=" + customerPhoto + "]";
	}

	
	
	
	
}
