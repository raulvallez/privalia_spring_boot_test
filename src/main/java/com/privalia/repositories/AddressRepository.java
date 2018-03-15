package com.privalia.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import com.privalia.domain.Address;

@RepositoryRestResource
public interface AddressRepository extends CrudRepository<Address,Integer>{
	
	Address findByStreet(String street);
	
	Address findByCity(String city);
	
	Address findByCountry(String country);
}
