package com.krungsri.kma.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krungsri.kma.api.entity.Address;


public interface AddressRepository extends JpaRepository<Address, Long>{
	
}
