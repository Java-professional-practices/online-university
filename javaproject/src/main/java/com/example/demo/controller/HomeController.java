package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class HomeController {
	
	
	 @RequestMapping("/home")
	public String home() {
		return "loginform";
	}
	 @RequestMapping("/")
	 @ResponseBody
	 public String Empty() {
		 return "Hello";
	 }
	 
	 @RequestMapping("/getData")
	 public String getData(HttpServletRequest res) {
		 String username = res.getParameter("username");
		 String password = res.getParameter("password");
		 String age = res.getParameter("age");
		 String city = res.getParameter("city");
		 HttpSession session = res.getSession();
		 session.setAttribute("username", username);
		 session.setAttribute("password", password);
		 session.setAttribute("age", age);
		 session.setAttribute("city", city);
		 return "home";
	 }
	 
	
		 
	 
}
