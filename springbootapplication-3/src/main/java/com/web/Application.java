package com.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.entity.Mobiles;
import com.web.repo.MobileRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private MobileRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
   @Override
  public void run(String... args) throws Exception {
	  //insertion of records
     /*Mobiles m1=new Mobiles(876,"b234","asus","128gb","64gb","berry","i5","50mp","120mp",95000.00,"989898");
     Mobiles m2=new Mobiles(987,"v9","poco","32gb","64gb","android","i11","15mp","30mp",35000.99,"7917");
     Mobiles m3=new Mobiles(18,"b3","oneplus","28gb","64gb","android","g45","34mp","43mp",80000.90,"5764");
     repo.save(m1);
     repo.save(m2);
     repo.save(m3);
     System.out.println("New records inserted successfully...");*/
	//get one record based on ID
	 /*System.out.println("***Get one record***");
	 Mobiles getone=repo.findById(100).get();
	 System.out.println(getone);*/

	 //get all records
	  /*System.out.println("***Get all records");
	  List<Mobiles> listofmobiles=(List<Mobiles>) repo.findAll();
	  System.out.println(listofmobiles);*/
	  //update records
	  /*System.out.println("***Update mobiles record");
	  Mobiles oldRecord=repo.findById(12).get();
	  Mobiles newData=new Mobiles();
	  newData.setCompany_name("Realme");
	  newData.setModelName("ns2324");
	  newData.setProcessor_name("i24");
	  oldRecord.setCompany_name(newData.getCompany_name());
	  oldRecord.setModelName(newData.getModelName());
	  oldRecord.setProcessor_name(newData.getProcessor_name());
	  repo.save(oldRecord);
	  System.out.println("Record updated successfully");*/
     //delete one record
	  /*System.out.println("***Delete one record");
	  repo.deleteById(18);
	  System.out.println("one record deleted successfully...");*/
   }
}
  

