package com.ofss.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofss.city.CityCustomerRepository;
import com.ofss.city.CityUserRepository;
import com.ofss.city.CityAccountRepository;
import com.ofss.city.City_bank_account_master;
import com.ofss.city.City_bank_customer_master;
import com.ofss.city.City_bank_users;
import com.ofss.hdcc.HdccAccountRepository;
import com.ofss.hdcc.HdccCustomerRepository;
import com.ofss.hdcc.Hdcc_bank_account_master;
import com.ofss.infinity.InfinityAccountRepository;
import com.ofss.infinity.InfinityCustomerRepository;


@Service
public class CityCustomerService {


	@Autowired
	CityAccountRepository cityRepository;
	@Autowired
	CityCustomerRepository customerRepository;
	@Autowired
	HdccCustomerRepository hdccCustomerRepository;
	@Autowired
	HdccAccountRepository hdccAccountRepository;
	@Autowired
	InfinityCustomerRepository infinityCustomerRepository;
	@Autowired
	InfinityAccountRepository infinityAccountRepository;
	@Autowired
	CityUserRepository userRepository;


	public void test(City_bank_customer_master cust) {
		System.out.println(cust);
	}

	
	//To add new record in City_bank_customer_master
	public void addCustomer(City_bank_customer_master cust) {
		System.out.println("Adding customer using customer repository...."+cust.getCustomerOccupation());
		customerRepository.addCustomer(cust.getCustomerName(), cust.getCustomerPermanentAddress(), cust.getCustomerCurrentAddress(),
				cust.getCustomerMobile(), cust.getCustomerEmail(), cust.getCustomerOccupation(), cust.getCustomerDob(), cust.getCustomerPanNumber(),
				cust.getCustomerAadhaarNumber(), cust.getCustomerPassportNumber(), cust.getCustomerEkycNumber(), cust.getUserId(), cust.getCustomerPhoto());
		//customerRepository.addCustId(cust.getCustomerEkycNumber());
	}

	
	//To add new record in City_bank_account_master
	public void addAccount(City_bank_customer_master cust) {
		City_bank_account_master acc = new City_bank_account_master();
	
		acc.setAccountName(cust.getCustomerName());
		acc.setOpeningDate(LocalDate.now());

		//The rest of the table values are added by default in cityAccountRepository
		cityRepository.addAccount(acc.getAccountName(),acc.getOpeningDate());

	}



	//To get all the account details
	public List<City_bank_account_master> getAllCityCustomers()
	{
		List<City_bank_account_master> allAccounts=new ArrayList<>();

		cityRepository.findAll()
		.forEach(customer -> allAccounts.add(customer) );
		return allAccounts;
	}

	public Optional<City_bank_account_master> getCityAccountsByAccountNo(int accNo){

		Optional<City_bank_account_master> cbcm= cityRepository.findById(accNo);
		return cbcm;
	}


//To get account details by customer Id
	public List<City_bank_account_master> getCityAccountsByCustId(int custId){
		List<City_bank_account_master> allAccounts=new ArrayList<>();

		allAccounts=cityRepository.findByCustomerId(custId);

		System.out.println(allAccounts);
		return allAccounts;
	}

	//To get the aggregate balance and ekyc check
	public String getAggregateBalance(int custId) {

		System.out.println("in the service class..........");
		String ekyc = customerRepository.findByCustomerId(custId).getCustomerEkycNumber();


		float Aggregate= 0.0f;

		List<City_bank_account_master> allAccounts=new ArrayList<>();

		allAccounts= cityRepository.findByCustomerId(custId);

		for(City_bank_account_master acc : allAccounts) {
			Aggregate = Aggregate+ acc.getAvailableBalance();
		}

		System.out.println("Acc Balance in City : "+Aggregate);

		System.out.println(ekyc);
		System.out.println("-------------------------");
		System.out.println(hdccCustomerRepository.existsByCustEkycNumber(ekyc));

		if(hdccCustomerRepository.existsByCustEkycNumber(ekyc)) {

			System.out.println("True");
			Aggregate = Aggregate+ hdccAccountRepository.getBalance(ekyc);
			System.out.println("Aggregate in HDCC : "+ hdccAccountRepository.getBalance(ekyc));
		}
		else 
			System.out.println("False");

		System.out.println(infinityCustomerRepository.existsByCustEkycNumber(ekyc));
		if(infinityCustomerRepository.existsByCustEkycNumber(ekyc)) {

			System.out.println("True");
			Aggregate = Aggregate+ infinityAccountRepository.getBalance(ekyc);
			System.out.println("Aggregate in Infinity : "+ infinityAccountRepository.getBalance(ekyc));
		}
		else
			System.out.println("False");


		System.out.println("================================================================");
		System.out.println("Total Balance : "+ Aggregate);


		return "Total Balance : "+Aggregate;

	}

	//To get customer Id from user Id
	public int getCustomerId(String userId) {

		City_bank_customer_master allCustomers=new City_bank_customer_master();

		allCustomers= customerRepository.findByUserId(userId);

		
			return allCustomers.getCustomerId();
		
	}


	//To check userId validation
	public boolean isValid(String userId,  String password) {


		try {
			City_bank_users user= new City_bank_users();
			user= userRepository.findByUserid(userId);
			if (userId.equals(user.getUserid()) && password.equals(user.getPassword())) {
				return true;
			}
			return false;
		}
		catch(NullPointerException e) {
			System.out.println("Invalid email");
			return false;
		}
		
	}


	public void addUser(String userId, String password) {
		
		City_bank_users user= new City_bank_users(userId, password);
		userRepository.save(user);
	}


}
