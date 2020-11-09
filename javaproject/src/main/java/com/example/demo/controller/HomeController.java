package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.User;

@Controller
public class HomeController {
	//private UserRepository repo;
	
	 @RequestMapping("/home")
	public String home() {
		return "registration";
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
		 HttpSession session = res.getSession();
		 session.setAttribute("username", username);
		 session.setAttribute("password", password);
		 return "home";
	 }
	 
	 @RequestMapping("getLoginData")
	 public ModelAndView getLoginData(@RequestParam("username") String username, @RequestParam("password") String password){
		 ModelAndView mv = new ModelAndView();
		 mv.addObject("username",username);
		 mv.addObject("password",password);
		 mv.setViewName("home");
		 return mv;
	 }
	 @RequestMapping("getUserData")
	 public ModelAndView getUserData(User user) {
		 ModelAndView mv = new ModelAndView();
		 mv.addObject("user",user);
		 mv.setViewName("home");
		 return mv;
		 
	 }
		 
	 
}
