package pl.atw.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.atw.demo.model.Author;
import pl.atw.demo.repo.AuthorsRepository;

@Controller
@RequestMapping("/add_new_author")
public class NewAuthorController {
	
	@Autowired
	private AuthorsRepository authRepo;
	
	@GetMapping
	public String showNewAuthorForm(@ModelAttribute(name="author") Author author) {
		return "add_new_author";
	}
	
	@PostMapping
	public String processNewAuthorForm(Model model,
			@ModelAttribute(name="author") Author author) {
		
		authRepo.save(author);
		return "start_employee";
	}

}
