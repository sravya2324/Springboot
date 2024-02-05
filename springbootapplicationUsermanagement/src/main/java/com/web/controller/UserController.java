package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.Users;
import com.web.repo.UserRepo;

@Controller
public class UserController {
   @Autowired
   private UserRepo repo;
   @RequestMapping("/")
   private String homepage()
   {
	   return "home";
   }
   @RequestMapping("/adduser")
   public String adduser()
   {
	   return "adduser";
   }
   @RequestMapping("/register")
   public String adduserdetails(Users users,ModelMap model)
   {
	   repo.save(users);
	   return "success";
   }
   @RequestMapping("/viewusers")
   public String viewAllUserDetails(ModelMap model)
   {
	   model.put("users",repo.findAll());
	   return "viewform";
   }
   @RequestMapping("/delete/{id}")
   public String deleteuser(@PathVariable int id)
   {
	   repo.deleteById(id);
	   return "redirect:/viewusers";
   }
   @RequestMapping("/edit/{id}")
   public String editform(@PathVariable int id,ModelMap model)
   {
	   model.put("command", repo.findById(id).get());
	   return "edituser";
   }
   @RequestMapping("/editandsave")
   public String editAndSaveUser(Users users,ModelMap model)
   {
	   repo.save(users);
	   return "redirect:/viewusers";
   }
}
