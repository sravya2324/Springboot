package com.rest.service;

import java.util.List;

import com.rest.model.Product;

public interface ProductService {
	public Product saveRecord(Product product);
	public void deleteRecord(int pid);
	public Product getOneRecord(int pid);
	public List<Product> getAll();
	public Product updateRecord(Product product, int pid);
}
