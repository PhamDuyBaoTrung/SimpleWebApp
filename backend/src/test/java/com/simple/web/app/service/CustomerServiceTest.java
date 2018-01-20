package com.simple.web.app.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.simple.web.app.AbstractSimpleWebAppTest;
import com.simple.web.app.domain.Customer;

public class CustomerServiceTest extends AbstractSimpleWebAppTest {
	
	@Autowired
	private CustomerService customerService;
	
	@Test
	public void testCreateANewCustomer() {
		// GIVEN
		Customer customer = new Customer("Test First Name", "Test Last Name");
		// WHEN
		customerService.saveAndUpdateCustomer(customer);
		// THEN
		
		List<Customer> persistedCustomers = customerService.findCustomerByLastName("Test Last Name");
		Assert.assertTrue("The list customer must be not empty", !persistedCustomers.isEmpty());
		Assert.assertEquals("The list customer must be contain only one customer", Integer.valueOf(1), Integer.valueOf(persistedCustomers.size()));
		
		// CLEAR DATA TO MAKE SURE THE UNITEST DB ALWAY CLEAN
		customerService.deleteCustomer(persistedCustomers.get(0).getId());
	}

}
