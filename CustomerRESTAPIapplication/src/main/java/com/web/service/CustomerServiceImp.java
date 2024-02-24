package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Customer;
import com.web.repo.CustomerRepo;

@Service
public class CustomerServiceImp implements CustomerService {
	
	@Autowired
	private CustomerRepo repo;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		Customer c=repo.save(customer);
		return c;
	}

	@Override
	public List<Customer> getAll() {
		List<Customer> c1= (List<Customer>) repo.findAll();
		return c1;
	}

	@Override
	public void delete(int id) {
		 repo.deleteById(id);
	}

	@Override
	public Customer update(Customer customer,int id) {
		Customer oldRecord= repo.findById(id).get();
		oldRecord.setId(customer.getId());
		oldRecord.setFirstName(customer.getFirstName());
		oldRecord.setLastName(customer.getLastName());
		oldRecord.setAddress(customer.getAddress());
		oldRecord.setCity(customer.getCity());
		oldRecord.setState(customer.getState());
		oldRecord.setEmail(customer.getEmail());
		oldRecord.setMobile(customer.getMobile());
		Customer update=repo.save(oldRecord);
		return update;
	}
	
}
