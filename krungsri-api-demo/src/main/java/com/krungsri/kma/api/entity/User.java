package com.krungsri.kma.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="\"Users\"")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private long id;
	@NotNull
	@Column(name = "username")
	private String userName;
	@NotNull
	@Column(name = "email")
	private String email;
	@NotNull
	@Column(name = "password")
    private String passWord;
	@NotNull
	@Column(name = "phone")
    private String phone;
	@NotNull
	@Column(name = "firstname")
    private String firstName;
	@NotNull
	@Column(name = "lastname")
    private String lastName;
	@NotNull
	@Column(name = "gendor")
    private String gendor;
	@NotNull
	@Column(name = "reference_code ")
    private String reference_code ;
	@NotNull
	@Column(name = "member_type ")
    private String member_type ;
	
	public User(){

    }

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public String getPassword() {
		return passWord;
	}

	public void setPassword(String password) {
		this.passWord = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGendor() {
		return gendor;
	}

	public void setGendor(String gendor) {
		this.gendor = gendor;
	}

	public String getMember_type() {
		return member_type;
	}

	public void setMember_type(String member_type) {
		this.member_type = member_type;
	}

	public String getReference_code() {
		return reference_code;
	}

	public void setReference_code(String reference_code) {
		this.reference_code = reference_code;
	}
}
