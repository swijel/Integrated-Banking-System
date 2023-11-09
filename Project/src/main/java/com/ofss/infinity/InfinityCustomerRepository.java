package com.ofss.infinity;

import org.springframework.data.repository.CrudRepository;


public interface InfinityCustomerRepository extends CrudRepository<Infinity_bank_customer_master, Integer> {

	public boolean existsByCustEkycNumber(String ekycno);
	
}
