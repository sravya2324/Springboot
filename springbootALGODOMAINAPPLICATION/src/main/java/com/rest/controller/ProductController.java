package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Product;
import com.rest.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	@PostMapping("/save")
	public String saveData(@RequestBody Product product)
	{
		Product p1=productService.saveRecord(product);
		String message=null;
		if(p1!=null)
		{
			message="Data saved successfully";
		}
		else
		{
			message="Data failed";
		}
		return message;
	}
	@GetMapping("/get/{pid}")
	public Product getone(@PathVariable int pid)
	{
		Product get= productService.getOneRecord(pid);
		return get;
	}
	@GetMapping("/getall")
	public List<Product> getAll()
	{
		List<Product> getAll= productService.getAll();
		return getAll;
	}
	@DeleteMapping("/delete/{pid}")
	public void delete(@PathVariable int pid)
	{
		productService.deleteRecord(pid);
	}
	@PutMapping("/update/{pid}")
	public Product update(@RequestBody Product product, @PathVariable int pid)
	{
		Product update= productService.updateRecord(product, pid);
		return update;
	}
	
}
