package com.ofss.infinity;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface InfinityAccountRepository extends CrudRepository<Infinty_bank_account_master, Integer> {

	//public List<Infinty_bank_account_master> findByHbcmCustEkycNumber(String ekyc);
	
	

	@Query(value=" select sum(acc_balance) from infinity_bank_account_master a natural join infinity_bank_customer_master c where CUST_EKYC_NUMBER =:n",nativeQuery=true)
	public float getBalance(@Param("n") String ekycNo);
}
