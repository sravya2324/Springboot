package com.web.service;

import java.util.List;

import com.web.model.Customer;

public interface CustomerService {
	public Customer saveCustomer(Customer customer);
	public List<Customer> getAll();
	public void delete(int id);
	public Customer update(Customer customer, int id);
}
