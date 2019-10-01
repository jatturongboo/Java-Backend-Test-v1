package com.krungsri.kma.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name="\"Addresse_Types\"")
@Entity
public class Addresse_Types {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long address_type_code;
	@NotNull
	private String address_type_description;
	
	public long getAddress_type_code() {
		return address_type_code;
	}
	public void setAddress_type_code(long address_type_code) {
		this.address_type_code = address_type_code;
	}
	public String getAddress_type_description() {
		return address_type_description;
	}
	public void setAddress_type_description(String address_type_description) {
		this.address_type_description = address_type_description;
	}
	
}
