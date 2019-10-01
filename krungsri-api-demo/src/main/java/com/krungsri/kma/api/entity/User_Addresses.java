package com.krungsri.kma.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name="\"User_Addresses\"")
@Entity
public class User_Addresses {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long user_address_id;
	@NotNull
	private String address_id;
	@NotNull
	private String user_id;
	@NotNull
	private String address_type_code;
	private String date_address_from;
	private String date_address_to;
	
	public long getUser_address_id() {
		return user_address_id;
	}
	public void setUser_address_id(long user_address_id) {
		this.user_address_id = user_address_id;
	}
	public String getAddress_id() {
		return address_id;
	}
	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getAddress_type_code() {
		return address_type_code;
	}
	public void setAddress_type_code(String address_type_code) {
		this.address_type_code = address_type_code;
	}
	public String getDate_address_from() {
		return date_address_from;
	}
	public void setDate_address_from(String date_address_from) {
		this.date_address_from = date_address_from;
	}
	public String getDate_address_to() {
		return date_address_to;
	}
	public void setDate_address_to(String date_address_to) {
		this.date_address_to = date_address_to;
	}
}
