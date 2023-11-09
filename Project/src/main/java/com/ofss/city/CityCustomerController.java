package com.ofss.city;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ofss.service.CityCustomerService;


//Controller for .jsp pages
@Controller
public class CityCustomerController {


	
	
	@Autowired
	CityCustomerService ccs;
	
	
	// Direct to Root page
	@GetMapping({"/", "/hello"})
	public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
		model.addAttribute("name", name);
		return "index";
	}
	
	//Direct to Signin page calling
	@GetMapping({"/signin", "/signin"})
	public String hello2(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
		System.out.println("into get");
		model.addAttribute("name", name);
		return "SignIn";
	}
	
	
	@PostMapping({"/signin", "/signin"})
	public String hello4(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name, @RequestParam String userId, @RequestParam String password) {
		model.addAttribute("name", name);
		System.out.println("post working");
		if(ccs.isValid(userId,password)) {
			return "menu";
		}
		
			return "SignIn";
	}
	
	//Direct to Signup page calling
	@GetMapping({"/signup"})
	public String hello3(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
		model.addAttribute("name", name);
		return "SignUp";
	}
	
	//Direct to Menu page calling
	@PostMapping({"/menu"})
	public String menu(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
		model.addAttribute("name", name);
		return "menu";
	}

	/* @GetMapping(value = "/welcome", produces = MediaType.TEXT_HTML_VALUE)
	    @ResponseBody
	    public String welcomeAsHTML() {
	        return "try.html";
	    }
*/





/*

	@RequestMapping(value="/cityBankAccounts/byNumber/{accNo}", method=RequestMethod.GET)
	public Optional<City_bank_account_master> getAccountsByAccountNumber(@PathVariable("accNo") int accNo)
	{
		System.out.println("List City customers by Id in controller.....");
		return ccs.getCityAccountsByAccountNo(accNo);

	}


*/

	

}








