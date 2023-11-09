package com.ofss.infinity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ofss.service.HdccCustomerService;
import com.ofss.service.InfinityCustomerService;

@RestController
public class InfinityController {

	
	@Autowired
	InfinityCustomerService ics;
	
	@RequestMapping(value="/infinityBankCustomers/{ekyc}", method=RequestMethod.GET)
	public Boolean ekycCheck(@PathVariable("ekyc")  String ekycno) {
		
		return ics.validateeKYC(ekycno);
		
	}
}
