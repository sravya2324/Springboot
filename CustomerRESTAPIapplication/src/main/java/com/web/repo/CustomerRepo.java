package com.web.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Customer;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
