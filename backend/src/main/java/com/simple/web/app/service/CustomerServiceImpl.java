package com.simple.web.app.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.owasp.esapi.ESAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.web.app.domain.Customer;
import com.simple.web.app.exception.NotFoundCustomerException;
import com.simple.web.app.repository.CustomerRepository;

@Transactional
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository repository;
	
	@Override
	public List<Customer> loadAllCustomer() {
		List<Customer> list = new ArrayList<>();
		Iterable<Customer> customers = repository.findAll();

		customers.forEach(list::add);
		return list;
	}

	@Override
	public List<Customer> findCustomerByLastName(String name) {
		return repository.findByLastName(name);
	}

	@Override
	public Customer saveAndUpdateCustomer(Customer customer) {
		if (!customer.isPersisted()) {
			return repository.save(new Customer(customer.getFirstName(), customer.getLastName()));
		}
		
		Customer persistedCustomer = repository.findOne(customer.getId());
		
		if (persistedCustomer == null) {
			throw new NotFoundCustomerException("Not found Customer with id " + customer.getId());
		}
		persistedCustomer.setFirstName(customer.getFirstName());
		persistedCustomer.setLastName(customer.getLastName());
		return repository.save(persistedCustomer);
	}

	@Override
	public void deleteCustomer(long id) {
		repository.delete(id);
	}

}
