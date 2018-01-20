package com.simple.web.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.simple.web.app.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByLastName(String lastName);
}