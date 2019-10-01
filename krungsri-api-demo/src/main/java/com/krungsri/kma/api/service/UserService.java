package com.krungsri.kma.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.krungsri.kma.api.entity.RegisterAccount;
import com.krungsri.kma.api.entity.User;
import com.krungsri.kma.api.repository.UserRepository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Service 
public class UserService {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.setUserRepository(userRepository);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
	
	public User initialUser(RegisterAccount account)
	{
		User objIns = new User();
		objIns.setUsername(account.getUsername());
		objIns.setReference_code(this.getReferenceCode(account.getPhone()));
		objIns.setPhone(account.getPhone());
		objIns.setPassword(passwordEncoder.encode(account.getPassword()));
		objIns.setMember_type(this.classifyMemberType(account.getSalary()));
		objIns.setLastName(account.getLastName());
		objIns.setFirstName(account.getFirstName());
		objIns.setEmail(account.getEmail());
		objIns.setGendor(account.getGendor());
		
		/*
		 * Implement Address Table Save
		 * Address address = new Address(); address.setLine_1(line_1);
		 * address.setLine_2(line_2); address.setLine_3(line_3);
		 * address.setDistrict(district); address.setCity(city);
		 * address.setCountry(country);
		 * address.setOther_address_details(other_address_details);
		 * address.setState_province_country(state_province_country);
		 * address.setZip_or_postalcode(zip_or_postalcode);
		 */
		
		return objIns;
	}
	
	public String getReferenceCode(String phone) {
		String lastFourDigits = ""; 
		
		if (phone.length() > 4) 
			lastFourDigits = phone.substring(phone.length() - 4);
		else 
			lastFourDigits = phone;

		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
		Date date = new Date();
		
		return dateFormat.format(date) + lastFourDigits;
	}
	
	public String classifyMemberType(double salary) {
		String memberType;
		  
        if(salary > 50000)
        	memberType = "P";
        else if(salary >= 30000 && salary <= 50000)
        	memberType = "G";
        else if(salary < 30000 && salary > 15000) 
        	memberType = "S";
        else
        	memberType = "R"; // Reject if Salary < 15,000 with member Type
        
        return memberType;
	}

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

}
