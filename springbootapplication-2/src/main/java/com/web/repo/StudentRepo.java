package com.web.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {
    
}
