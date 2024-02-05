package com.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.entity.Student;
import com.web.repo.StudentRepo;

@SpringBootApplication
public class Application implements CommandLineRunner{
    @Autowired
    private StudentRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
  @Override
public void run(String... args) throws Exception {
	  //insertion of records
     Student s1=new Student(104,"psycho","spring",5000.99);
     Student s2=new Student(103,"mary","springboot",8000.00);
     repo.save(s1);
     repo.save(s2);
     System.out.println("New record inserted successfully...");
	//get one record based on ID
	 System.out.println("***Get one record***");
	 Student getone=repo.findById(101).get();
	 System.out.println(getone);
	 //get all records
	  System.out.println("***Get all records");
	  List<Student> listofstudents=(List<Student>) repo.findAll();
	  System.out.println(listofstudents);
	  //update records
	  System.out.println("***Update student record");
	  Student oldRecord=repo.findById(103).get();
	  Student newData=new Student();
	  newData.setStdName("Rosemary");
	  newData.setCourse("java");
	  newData.setFee(9500.00);
	  oldRecord.setStdName(newData.getStdName());
	  oldRecord.setCourse(newData.getCourse());
	  oldRecord.setFee(newData.getFee());
	  repo.save(oldRecord);
	  System.out.println("Record updated successfully");
     //delete one record
	  System.out.println("***Delete one record");
	  repo.deleteById(104);
	  System.out.println("one record deleted successfully...");
 }
}
