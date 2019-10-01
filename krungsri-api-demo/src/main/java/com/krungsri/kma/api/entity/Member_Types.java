package com.krungsri.kma.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name="\"Member_Types\"")
@Entity
public class Member_Types {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long member_type_code;
	@NotNull
	private String member_type_description;
	
	public long getMember_type_code() {
		return member_type_code;
	}
	public void setMember_type_code(long member_type_code) {
		this.member_type_code = member_type_code;
	}
	public String getMember_type_description() {
		return member_type_description;
	}
	public void setMember_type_description(String member_type_description) {
		this.member_type_description = member_type_description;
	}
}
