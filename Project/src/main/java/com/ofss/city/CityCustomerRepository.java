package com.ofss.city;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CityCustomerRepository extends CrudRepository<City_bank_customer_master, Integer> {

	public City_bank_customer_master findByCustomerId(int custId);
	public City_bank_customer_master findByUserId(String userId);
	
	//The following query will insert in City_bank_customer_master
	@Modifying
	//It is used for transaction property in database
	@Transactional
	@Query(value="insert into city_bank_customer_master values(seq_custId.nextval,:name,:paddress,:caddress,:number,:email,:occup,:dob,:pan,:aadhaar,:ppno,:ekyc,:userId,:customerPhoto)",nativeQuery=true)
	public void addCustomer(@Param("name") String customerName, @Param("paddress") String customerPermanentAddress,@Param("caddress") String customerCurrentAddress,
			@Param("number") String customerMobile, @Param("email") String customerEmail,@Param("occup") String customerOccupation,@Param("dob") LocalDate customerDob,
			@Param("pan") String customerPanNumber,@Param("aadhaar") String customerAadhaarNumber, @Param("ppno") String customerPassportNumber,
			@Param("ekyc") String customerEkycNumber,@Param("userId") String userId, @Param("customerPhoto") String customerPhoto);
}
