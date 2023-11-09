package com.ofss.city;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CityUserRepository extends CrudRepository<City_bank_users, String>{

	public boolean existsByPassword(String pwd);


	public City_bank_users findByUserid(String userId);
}
