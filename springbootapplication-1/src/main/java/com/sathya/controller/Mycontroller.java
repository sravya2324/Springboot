package com.sathya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Mycontroller {
@RequestMapping("/home")
  public String homePage()
  {
	  return "home";
  }
  
}
