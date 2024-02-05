package com.rest.service;

import java.util.List;

import com.rest.model.Product;

public interface ProductService {
   public Product saveRecord(Product product);
   public void deleteRecord(int cid);
   public Product getOneRecord(int cid);
   public List<Product> getAll();
   public Product updateRecord(Product product, int cid);
}
