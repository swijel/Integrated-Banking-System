package com.ofss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofss.infinity.InfinityCustomerRepository;

@Service
public class InfinityCustomerService {

	
	@Autowired
	InfinityCustomerRepository infinityRepository;
	
	
	public boolean validateeKYC(String ekyc) {

		System.out.println("validateeKYC Service called....");
		
		
		return infinityRepository.existsByCustEkycNumber(ekyc);
	}

}
