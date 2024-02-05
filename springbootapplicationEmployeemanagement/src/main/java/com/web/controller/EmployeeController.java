package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.Employee;
import com.web.repo.EmployeeRepo;

@Controller
public class EmployeeController {
   @Autowired
   private EmployeeRepo repo;
   @RequestMapping("/")
   private String homepage()
   {
	   return "home";
   }
   @RequestMapping("/addemployee")
   public String addemployee()
   {
	   return "addemployee";
   }
   @RequestMapping("/register")
   public String adduserdetails(Employee employee,ModelMap model)
   {
	   repo.save(employee);
	   return "success";
   }
   @RequestMapping("/viewemployees")
   public String viewAllEmployeeDetails(ModelMap model)
   {
	   model.put("employees",repo.findAll());
	   return "viewform";
   }
   @RequestMapping("/delete/{id}")
   public String deleteemployee(@PathVariable int id)
   {
	   repo.deleteById(id);
	   return "redirect:/viewemployees";
   }
   @RequestMapping("/edit/{id}")
   public String editform(@PathVariable int id,ModelMap model)
   {
	   model.put("command", repo.findById(id).get());
	   return "editemployee";
   }
   @RequestMapping("/editandsave")
   public String editAndSaveUser(Employee employee,ModelMap model)
   {
	   repo.save(employee);
	   return "redirect:/viewemployees";
   }
   @RequestMapping("/reset")
   public String resetemployee()
   {
	   return "addemployee";
   }
}
