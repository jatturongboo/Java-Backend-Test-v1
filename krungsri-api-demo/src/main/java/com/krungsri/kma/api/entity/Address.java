package com.krungsri.kma.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name="\"Address\"")
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long address_id;
	@NotNull
	private String line_1;
	private String line_2;
	private String line_3;
	@NotNull
	private String city;
	@NotNull
	private String district;
	@NotNull
	private String zip_or_postalcode;
	@NotNull
	private String country;
	@NotNull
	private String state_province_country;
	@NotNull
	private String other_address_details;
	
	public long getAddress_id() {
		return address_id;
	}
	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}
	public String getLine_1() {
		return line_1;
	}
	public void setLine_1(String line_1) {
		this.line_1 = line_1;
	}
	public String getLine_2() {
		return line_2;
	}
	public void setLine_2(String line_2) {
		this.line_2 = line_2;
	}
	public String getLine_3() {
		return line_3;
	}
	public void setLine_3(String line_3) {
		this.line_3 = line_3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getZip_or_postalcode() {
		return zip_or_postalcode;
	}
	public void setZip_or_postalcode(String zip_or_postalcode) {
		this.zip_or_postalcode = zip_or_postalcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState_province_country() {
		return state_province_country;
	}
	public void setState_province_country(String state_province_country) {
		this.state_province_country = state_province_country;
	}
	public String getOther_address_details() {
		return other_address_details;
	}
	public void setOther_address_details(String other_address_details) {
		this.other_address_details = other_address_details;
	}
}
