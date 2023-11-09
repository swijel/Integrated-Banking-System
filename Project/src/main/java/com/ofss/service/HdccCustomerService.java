package com.ofss.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofss.hdcc.HdccCustomerRepository;

@Service
public class HdccCustomerService {



	@Autowired
	HdccCustomerRepository hdccRepository;


	public boolean validateeKYC(String ekyc) {

		System.out.println("validateeKYC Service called....");
		
		
		return hdccRepository.existsByCustEkycNumber(ekyc);
	}







}
