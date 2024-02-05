package com.web.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.entity.Book;

@Repository
public interface BookRepo extends CrudRepository<Book,Integer> {

}
