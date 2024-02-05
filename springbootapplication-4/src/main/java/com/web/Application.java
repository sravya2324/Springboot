package com.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.entity.Book;
import com.web.repo.BookRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private BookRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
   @Override
  public void run(String... args) throws Exception {
	  //insertion of records
     Book b1=new Book(23,"tenaliramkrishna","nani","45ps","nanipublishers","1985",240.00);
     Book b2=new Book(24,"atomichabits","siri","3456hg","siripublishers","2000",345.90);
     Book b3=new Book(34,"harrypotter","praveenkumar","100ps","praveenpublications","2003",500.90);
     Book b4=new Book(76,"hamlet","hari","45tg","haripublications","2002",333.90);
     repo.save(b1);
     repo.save(b2);
     repo.save(b3);
     repo.save(b4);
     System.out.println("New records inserted successfully...");
	//get one record based on ID
	 /*System.out.println("***Get one record***");
	 Book getone=repo.findById(18).get();
	 System.out.println(getone);*/
	 //get all records
	  /*System.out.println("***Get all records");
	  List<Book> listofbooks=(List<Book>) repo.findAll();
	  System.out.println(listofbooks);*/
	  //update records
	  /*System.out.println("***Update book record");
	  Book oldRecord=repo.findById(456).get();
	  Book newData=new Book();
	  newData.setAuthor_name("victoria");
	  newData.setPrice(232.88);
	  newData.setPublisher_name("taekookpublishers");
	  oldRecord.setAuthor_name(newData.getAuthor_name());
	  oldRecord.setPrice(newData.getPrice());
	  oldRecord.setPublisher_name(newData.getPublisher_name());
	  repo.save(oldRecord);
	  System.out.println("Record updated successfully");*/
     //delete one record
	  /*System.out.println("***Delete one record");
	  repo.deleteById(18);
	  System.out.println("one record deleted successfully...");*/
   }
}

  

