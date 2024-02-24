package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Customer;
import com.web.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	@PostMapping("/save")
	public Customer saveCustomer(@RequestBody Customer customer)
	{
		Customer c=service.saveCustomer(customer);
		return c;
	}
	@GetMapping("/getall")
	public List<Customer> getAll()
	{
		List<Customer> getAll=service.getAll();
		return getAll;
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id)
	{
		service.delete(id);
	}
	@PutMapping("/update/{id}")
	public Customer update(@RequestBody Customer customer,@PathVariable int id)
	{
		Customer update= service.update(customer, id);
		return update;
	}
}
