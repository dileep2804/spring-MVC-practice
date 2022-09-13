package com.dileep.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showform(Model theModel) {
		
		//create student object
		Student theStudent = new Student();
		
		//put it in the model
		theModel.addAttribute("studdent", theStudent);
		
		//while loading the form spring will call getfirstName();
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String fetchform(@ModelAttribute("studdent") Student theStudent) {
		
		//log the input data
		System.out.println("registered student is: "+theStudent.getFirstName()
							+" "+ theStudent.getLastName());
		
		//when form is submitted spring will call setfirstName() 
		return "student-confirmation";
	}
}
