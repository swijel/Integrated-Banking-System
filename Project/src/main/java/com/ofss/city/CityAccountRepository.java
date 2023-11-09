package com.ofss.city;

import java.time.LocalDate;
import java.util.List;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CityAccountRepository extends CrudRepository<City_bank_account_master, Integer>{

	public List<City_bank_account_master> findByCustomerId(int custId);
	
	//The following query will insert in City_bank_account_master
	@Modifying
	@Transactional
	@Query(value="insert into City_bank_account_master values(seq_accNo.nextval, :n, :m, 'SAVING', 5000, seq_custId.currval)",nativeQuery=true)
	public void addAccount(@Param("n") String accountName, @Param("m") LocalDate openingDate);

}
