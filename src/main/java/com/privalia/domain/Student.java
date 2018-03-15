package com.privalia.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//import org.hibernate.annotations.DynamicUpdate;

import io.swagger.annotations.ApiModelProperty;

@Entity
//@DynamicUpdate(value = true) //solo modifica los campos que han cambiado, PERO sigo haciendo select
public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "The database generated product ID")
	private Integer id;
	
	@Version
	@ApiModelProperty(notes = "The auto-generated version of the product")
	private Integer version;
	
	@ApiModelProperty(notes = "The student-specific address ID")
	private String addressId;
	
	@ApiModelProperty(notes= "Student Name")
	@Size(min = 2, max = 200)
	private String Name;
	
	
	@ApiModelProperty(notes= "Student Surname")
	@Size(min = 2, max = 200)
	private String Surname;
	


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the version
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * @return the addressId
	 */
	public String getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return Surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		Surname = surname;
	}
	
}
