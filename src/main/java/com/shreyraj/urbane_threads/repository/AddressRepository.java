package com.shreyraj.urbane_threads.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreyraj.urbane_threads.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
