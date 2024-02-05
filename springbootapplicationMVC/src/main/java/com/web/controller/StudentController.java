package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.Student;
import com.web.service.StudentServiceImp;

@Controller
public class StudentController {
	@Autowired
	private StudentServiceImp service;
   @RequestMapping("/")
   public String homepage()
   {
	   return "home";
   }
   @RequestMapping("/addstudent")
   public String addStudents()
   {
	   return "student";
   }
   @RequestMapping("/register")
   public String saveMarks(Student student)
   {
	   Student s=service.savestudent(student);
	   return "success";
   }
   @RequestMapping("/viewstudents")
   public String viewallstudents(ModelMap model)
   {
	   model.put("students",service.getallstudents());
	   return "viewform";
}
   @RequestMapping("/delete/{stdId}")
   public String delete(@PathVariable int stdId)
   {
	   service.deletestudent(stdId);
	   return "redirect:/viewform";
   }
   @RequestMapping("/edit/{stdId}")
   public String edit(@PathVariable int stdId,ModelMap model)
   {
	   model.put("command", service.getstudent(stdId));
	   return "editstudent";
   }
   @RequestMapping("/editandsave")
   public String editAndSave(Student student)
   {
	   Student edit=service.updateestudent(student);
	   return "redirect:/viewform";
   }
}
