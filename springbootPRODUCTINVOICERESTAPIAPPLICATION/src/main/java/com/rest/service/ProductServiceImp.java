package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Product;
import com.rest.repo.ProductRepo;

@Service
public class ProductServiceImp implements ProductService {
  @Autowired
  private ProductRepo productrepo;
	@Override
	public Product saveRecord(Product product) {
		double tot=0.0;
		double disc=0.0;
		double gst=0.0;
		double invoice=0.0;
		tot=product.getPrice()*product.getQuantity();
		product.setTotal(tot);
		if(tot<2500)
		{
			disc=0.10;
		}
		else if(tot>=2500&&tot<5000)
		{
			disc=0.15;
		}
		else if(tot>=5000)
		{
			disc=0.30;
		}
		disc=tot*disc;
		invoice=tot-disc+gst;
		product.setDiscount(disc);
		product.setInvoice_bill(invoice);
		product.setGst_amount(gst);
		Product p=productrepo.save(product);
		return p;
	}
	@Override
	public Product getOneRecord(int cid) {
		Product get=productrepo.findById(cid).get();
		return get;
	}
	@Override
	public List<Product> getAll() {
		List<Product> getAll=productrepo.findAll();
		return getAll;
	}

	@Override
	public Product updateRecord(Product product,int cid) {
		Product oldRecord=productrepo.findById(cid).get();
		oldRecord.setCname(product.getCname());
		oldRecord.setMobile(product.getMobile());
		oldRecord.setPname(product.getPname());
		oldRecord.setPrice(product.getPrice());
		oldRecord.setQuantity(product.getQuantity());
		double tot=0.0;
		double disc=0.0;
		double gst=0.0;
		double invoice=0.0;
		tot=product.getPrice()*product.getQuantity();
		product.setTotal(tot);
		if(tot<2500)
		{
			disc=0.10;
		}
		else if(tot>=2500&&tot<5000)
		{
			disc=0.15;
		}
		else if(tot>=5000)
		{
			disc=0.30;
		}
		disc=tot*disc;
		invoice=tot-disc+gst;
		oldRecord.setDiscount(disc);
		oldRecord.setInvoice_bill(invoice);
		oldRecord.setGst_amount(gst);
		Product p=productrepo.save(oldRecord);
		return p;
	}
	@Override
	public void deleteRecord(int cid) {
		productrepo.deleteById(cid);
	}
}
