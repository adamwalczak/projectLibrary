package pl.atw.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.atw.demo.model.Book;
import pl.atw.demo.repo.BooksRepository;

@Controller
@RequestMapping("/add_new_book")
public class NewBookController {

	@Autowired
	private BooksRepository booksRepo;
	
	@GetMapping
	public String showNewBookForm(@ModelAttribute(name="book") Book book) {
		return "add_new_book";
	}
	
	@PostMapping
	public String processNewBookForm(Model model,
			@ModelAttribute(name="book") Book book) {
		
		booksRepo.save(book);
		return "start_employee";
	}
}
