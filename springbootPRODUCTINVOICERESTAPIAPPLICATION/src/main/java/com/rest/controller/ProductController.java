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
   private ProductService productservice;
	@PostMapping("/save")
	public String saveData(@RequestBody Product product)
	{
		Product p1=productservice.saveRecord(product);
		String message=null;
		if(p1!=null)
		{
			message="Data Saved successfully";
		}
		else
		{
			message="Data failed";
		}
		return message;
	}
	@GetMapping("/get/{cid}")
	public Product getone(@PathVariable int cid)
	{
		Product get=productservice.getOneRecord(cid);
		return get;
	}
	@GetMapping("/getall")
	public List<Product> getAll()
	{
		List<Product> getAll=productservice.getAll();
		return getAll;
	}
	@PutMapping("/update/{cid}")
	public Product update(@RequestBody Product product,@PathVariable int cid)
	{
		Product update=productservice.updateRecord(product,cid);
		return update;
	}
	@DeleteMapping("/delete/{cid}")
	   public void delete(@PathVariable int cid)
	   {
		   productservice.deleteRecord(cid);
	   }

}
