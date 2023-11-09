package com.ofss.city;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City_bank_users {

	
	@Id
	String userid;
	String password;
	
	
	public City_bank_users(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}


	public City_bank_users() {
		// TODO Auto-generated constructor stub
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "City_bank_users [userid=" + userid + ", password=" + password + "]";
	}

	
	
}
