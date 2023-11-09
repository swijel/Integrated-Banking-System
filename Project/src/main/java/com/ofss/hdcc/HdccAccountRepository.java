package com.ofss.hdcc;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface HdccAccountRepository extends CrudRepository<Hdcc_bank_account_master, Integer> {

	
	//Joins hdcc_bank_account_master and hdcc_bank_customer_master number to get total balance over ekyc
	//n is the bind parameter
	@Query(value="select sum(acc_balance) from hdcc_bank_account_master a natural join hdcc_bank_customer_master c where CUST_EKYC_NUMBER =:n",nativeQuery=true)
	public float getBalance(@Param("n") String ekycNo);
}
