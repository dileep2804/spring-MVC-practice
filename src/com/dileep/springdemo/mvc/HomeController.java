package com.dileep.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //tell spring that it is a mvc controller
public class HomeController {

	//define controller method
	@RequestMapping("/")  //will handle all type of HTTP request (GET,POST,PUT,DELETE)
	public String showPage() {
		return "main-menu";  //not full name of page use prefix and suffix
	}
}
