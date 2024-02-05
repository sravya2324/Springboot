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

import com.rest.model.Electricity;
import com.rest.service.ElectricityService;

@RestController
public class ElectricityController {
   @Autowired
   private ElectricityService electricityservice;
   @PostMapping("/save")
   public String saveData(@RequestBody Electricity electricity)
   {
	   Electricity e1=electricityservice.saveRecord(electricity);
	   String message=null;
	   if(e1!=null)
	   {
		   message="Data saved successfully";
	   }
	   else
	   {
		   message="Data insertion failed";
	   }
	   return message;
   }
   @GetMapping("/get/{cid}")
   public Electricity getone(@PathVariable int cid)
   {
	   Electricity get=electricityservice.getOneRecord(cid);
	   return get;
   }
   @GetMapping("/getall")
   public List<Electricity> getAll()
   {
	   List<Electricity> getAll=electricityservice.getAllRecord();
	   return getAll;
}
   @PutMapping("/update/{cid}")
   public Electricity update(@RequestBody Electricity electricity,@PathVariable int cid)
   {
	   Electricity update=electricityservice.updateRecord(electricity, cid);
	   return update;
   }
   @DeleteMapping("/delete/{cid}")
   public void delete(@PathVariable int cid)
   {
	   electricityservice.deleteRecord(cid);
   }
}
