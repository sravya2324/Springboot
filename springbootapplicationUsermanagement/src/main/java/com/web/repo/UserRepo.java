package com.web.repo;

import org.springframework.data.repository.CrudRepository;

import com.web.model.Users;

public interface UserRepo extends CrudRepository<Users,Integer> {

}
