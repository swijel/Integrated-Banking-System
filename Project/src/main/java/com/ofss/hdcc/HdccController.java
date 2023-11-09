package com.ofss.hdcc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ofss.service.HdccCustomerService;

@RestController
public class HdccController {

	
	@Autowired
	HdccCustomerService hcs;
	
	@RequestMapping(value="/hdccBankCustomers/{ekyc}", method=RequestMethod.GET)
	public Boolean ekycCheck(@PathVariable("ekyc")  String ekycno) {
		
		return hcs.validateeKYC(ekycno);
		
	}
}
