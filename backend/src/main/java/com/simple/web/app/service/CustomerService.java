package com.simple.web.app.service;

import java.util.List;

import com.simple.web.app.domain.Customer;

public interface CustomerService {
	/**
	 * Load all list customer in DB
	 * @return
	 */
	public List<Customer> loadAllCustomer();
	
	/**
	 * find list of {@link Customer} by name
	 * @param name
	 * @return
	 */
	public List<Customer> findCustomerByLastName(String name);
	
	/**
	 * save or update a customer
	 * @param customer
	 * @return
	 */
	public Customer saveAndUpdateCustomer(Customer customer);
	
	/**
	 * delete a customer by id
	 * @param id
	 */
	public void deleteCustomer(long id);
	
}
