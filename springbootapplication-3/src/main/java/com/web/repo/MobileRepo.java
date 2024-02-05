package com.web.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.entity.Mobiles;

@Repository
public interface MobileRepo extends CrudRepository<Mobiles,Integer> {

}
