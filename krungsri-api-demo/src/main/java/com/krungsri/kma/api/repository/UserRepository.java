package com.krungsri.kma.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.krungsri.kma.api.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	@Query("select u from User u where u.email = ?1")
	User findByEmailAddress(String email);
	
	public default  String get() {
		return "Hello Mockito From Repository";
	}
}
