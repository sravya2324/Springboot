package com.web.repo;

import org.springframework.data.repository.CrudRepository;

import com.web.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
