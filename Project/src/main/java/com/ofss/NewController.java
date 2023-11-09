package com.ofss;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.ofss.city.City_bank_account_master;
import com.ofss.city.City_bank_customer_master;
import com.ofss.service.CityCustomerService;
import com.ofss.service.FileUploadUtil;

//Api controller

@RestController

public class NewController {


	@Autowired
	CityCustomerService ccs;

	
	//To add a new record in customer, account, user tables
	@RequestMapping(path="/customer/add",method=RequestMethod.POST, produces = MediaType.TEXT_HTML_VALUE)
	public String m1(HttpServletRequest request, MultipartHttpServletRequest multipartRequest)
	{
		String fName = request.getParameter("firstname");
		String lName = request.getParameter("lastname");
		String customerPermanentAddress = request.getParameter("Permanent_Address");
		String customerCurrentAddress = request.getParameter("Current_Address");
		String customerMobile = request.getParameter("phoneNumber");
		String customerEmail = request.getParameter("email");
		String customerOccupation = request.getParameter("Job");
		LocalDate customerDob =LocalDate.parse(request.getParameter("DOB"));
		String customerPanNumber = request.getParameter("Pan_Card_Number");
		String customerAadhaarNumber = request.getParameter("Aadhar_No");
		String customerPassportNumber = request.getParameter("Passport_No");
		String customerEkycNumber = request.getParameter("E_Kyc_No");
		String customerName = fName+ " " + lName;
		int customerId=1001;
		String userId= customerEkycNumber;
		String password = fName;
		
		//Datatype to store an image via html
		MultipartFile multipartFile = multipartRequest.getFile("image");
		//converting datatype from multipartfile to String
		String customerPhoto = StringUtils.cleanPath(multipartFile.getOriginalFilename());

		City_bank_customer_master cust = new City_bank_customer_master(customerId, customerName, customerPermanentAddress,
				customerCurrentAddress,  customerMobile,  customerEmail,  customerOccupation,
				customerDob,  customerPanNumber,  customerAadhaarNumber,
				customerPassportNumber,  customerEkycNumber,  userId);
		
		//Creating and storing directory
		String uploadDir = "user-photos/" + cust.getUserId();
		try {
			FileUploadUtil.saveFile(uploadDir, customerPhoto, multipartFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		cust.setCustomerPhoto(uploadDir);
		
		ccs.addUser(userId,password);
		ccs.addCustomer(cust);
		ccs.addAccount(cust);
		String eg = "UserId is: " + userId + "\n" + "Password: " + password;
		
		return eg + "<br>" + "<a href= '/signin'>Click here To SignIn</a> ";
	}

	
	@RequestMapping(value="/getCustId/{userId}", method=RequestMethod.GET)
	public int getCustId(@PathVariable("userId") String userId)
	{
		System.out.println("Get customer Id from user Id");
		return ccs.getCustomerId(userId);
	}
	

	@RequestMapping(value="/cityBankAccounts/{userId}", method=RequestMethod.GET)
	public List<City_bank_account_master> getAccountsByCustId(@PathVariable("userId") String userId)
	{
		int custId = ccs.getCustomerId(userId);
		System.out.println("List City customers by Id in controller.....");
		return ccs.getCityAccountsByCustId(custId);

	}
	
	@RequestMapping(value="/CustomerAggregateBalance/{userId}", method=RequestMethod.GET)
	public String getAggregateBal(@PathVariable("userId") String userId)
	{
		int custId = ccs.getCustomerId(userId);
		System.out.println("/CustomerAggregateBalance/..............");
		return ccs.getAggregateBalance(custId);
	}
	
	@RequestMapping(value="/cityBankCustomers", method=RequestMethod.GET)
	public List<City_bank_account_master> getAllAccountDetails()
	{
		System.out.println("List all City customers' Account Details in controller.....");
		return ccs.getAllCityCustomers();

	}
	
	@RequestMapping(value="/checkUserId/{userId}", method=RequestMethod.GET)
	public boolean checkUserId(@PathVariable("userId") String userId)
	{
		System.out.println("Check user validation ...");
		return ccs.isValid(userId, "Swijel");
	}
	
}


