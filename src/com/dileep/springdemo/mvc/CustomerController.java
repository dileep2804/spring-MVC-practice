package com.dileep.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//add an initbinder... to convert trim input strings
	//remove leading and trailing whitespaces from input strings
	//resolve issue for our validation
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//create Customer Model
		Customer customer1=new Customer();
		
		// add Customer object to the model
		theModel.addAttribute("message1", customer1);
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processFORM(@Valid @ModelAttribute("message1") Customer customer1,
			BindingResult theBindingResult) {
		
		String firstName=customer1.getFirstName();
		String lastName= customer1.getLastName();
		
		if(firstName!=null) {
			firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
		}
		
		if(lastName!=null) {
			lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
		}

		customer1.setFirstName(firstName);
		customer1.setLastName(lastName);
		
		System.out.println("First Name:|"+customer1.getFirstName()
		+"| Last Name:|"+customer1.getLastName()+"|\n");
		
		System.out.println("Binding result: "+theBindingResult);
		
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}
		else {
			return "customer-confirmation";
		}

	}
}
