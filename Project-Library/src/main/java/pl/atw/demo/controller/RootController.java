package pl.atw.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	
	@RequestMapping("/start_employee")
	public String start_employee() {
		return "start_employee";
	}
	
}
