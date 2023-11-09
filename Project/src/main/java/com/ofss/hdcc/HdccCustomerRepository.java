package com.ofss.hdcc;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface HdccCustomerRepository extends CrudRepository<Hdcc_bank_customer_master, Integer> {

	public boolean existsByCustEkycNumber(String ekycno);
	
/*	
	@Query("select custEkycNumber from Hdcc_bank_customer_master hc where hc.custId=:n")
	public String getrecord(@Param("n") int custId);
*/
	
}
