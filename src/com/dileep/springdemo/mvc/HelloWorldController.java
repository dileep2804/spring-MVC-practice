package com.dileep.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//need a controller method to show initial HTML form
	@RequestMapping("/showForm")
	public String showFrom() {
		return "helloworld-form";
	}
	
	//need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";  //return helloworld.jsp page
	}
	
	//new controller method to read form data from HTML form
	//add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsshoutDude(HttpServletRequest request, Model model) {
		
		//read the request parameter
		String name=request.getParameter("StudentName");
		
		//convert name to uppercase
		name = name.toUpperCase();
		
		//create message
		name= "Yo! " + name;
		
		//add data to the model
		model.addAttribute("message2", name);
		
		return "helloworld";
	}
	
	//capture data from  spring mvc form
	@RequestMapping("/processFormVersionThree")
	public String processFormv3(
			@RequestParam("StudentName") String name, Model model) {
		
		//convert name to uppercase
		name = name.toUpperCase();
		
		//create message
		name= "hey my friend from v3  " + name;
		
		//add data to the model
		model.addAttribute("message3", name);
		
		return "helloworld";
	}
}
