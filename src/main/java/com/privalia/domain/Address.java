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
public class Address {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "Address ID")
	private Integer id;
	
	@Version
	@ApiModelProperty(notes = "The auto-generated version")
	private Integer version;
	
	@ApiModelProperty(notes = "Street")
	@Size(min = 6, max = 400)
	private String street;
	
	@ApiModelProperty(notes= "City")
	@Size(min = 6, max = 400)
	private String city;
	
	@ApiModelProperty(notes= "Country")
	@Size(min = 6, max = 400)
	private String country;

}
