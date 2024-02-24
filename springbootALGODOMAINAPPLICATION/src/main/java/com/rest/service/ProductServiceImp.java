package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Product;
import com.rest.repo.ProductRepo;

@Service
public class ProductServiceImp implements ProductService {
	@Autowired
	private ProductRepo productRepo;
	@Override
	 public Product saveRecord(Product product) {
        double dis = 0.0;
        double gst = 0.0;
        double finalPrice;
        double price = product.getPrice();	        
        String compare=product.getCharges().getCategory();

        if (product.getCategories().equals(compare)) {
            dis = price * product.getCharges().getDiscount();
            gst = price * product.getCharges().getGst();
        }
        finalPrice = product.getPrice() + gst - dis;
        product.setFinalprice(finalPrice);
        Product p = productRepo.save(product);
        return p;
	}	
	 @Override 
	public void deleteRecord(int pid) {
		 productRepo.deleteById(pid);
	}

	@Override
	public Product getOneRecord(int pid) {
		Product get= productRepo.findById(pid).get();
		return get;
	}

	@Override
	public List<Product> getAll() {
		List<Product> getAll= productRepo.findAll();		
		return getAll;
	}

	@Override
	public Product updateRecord(Product product, int pid) {
		Product oldRecord= productRepo.findById(pid).get();
		oldRecord.setPname(product.getPname());
		oldRecord.setPtype(product.getPtype());
		oldRecord.setCategories(product.getCategories());
		oldRecord.setPrice(product.getPrice());
		oldRecord.setCharges(product.getCharges());
		double dis = 0.0;
        double gst = 0.0;
        double finalPrice;
        double price = product.getPrice();	        
        String compare=product.getCharges().getCategory();

        if (product.getCategories().equals(compare)) {
            dis = price * product.getCharges().getDiscount();
            gst = price * product.getCharges().getGst();
        }
        finalPrice = price + gst - dis;
        oldRecord.setFinalprice(finalPrice);
        Product p = productRepo.save(oldRecord);
        return p;
	}
	}

