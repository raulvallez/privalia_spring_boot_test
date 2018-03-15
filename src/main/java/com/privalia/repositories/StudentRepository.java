package com.privalia.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import com.privalia.domain.Student;

@RepositoryRestResource
public interface StudentRepository extends CrudRepository<Student,Integer> {

	Student findByName(String name);
	
	Student findBySurname(String surname);
	
	Student findByAddressId(String addressId);
	
	Student findByNameAndSurname(String name, String surname);
	
	
	//Modificamos el name del Student
	@Modifying //como que estás modificando
	@Transactional
	@Query("UPDATE  Student s SET s.name = :name WHERE p.id = :id") //para poner una consulta personalizada
	int updateStudent(@Param("id") int id, @Param("name") String description);
	
	@Modifying //como que estás modificando
	@Transactional
	@Query(value = "INSERT INTO Address(id, street, city, country) VALUES (?1, ?2, ?3, ?4)", nativeQuery = true)
	int insertAddress(@Param("id") int id, 
			@Param("street") String street, 
			@Param("city") String city,
			@Param("country") String country);
	
	
}
