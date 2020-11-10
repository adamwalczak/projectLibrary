package pl.atw.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.atw.demo.model.Book;
import pl.atw.demo.repo.BooksRepository;

@Controller
@RequestMapping("/books")
public class BooksController {

	@Autowired
	private BooksRepository repo;
	
	@GetMapping
	public String listProducts(Model model) {
		List<Book> books = repo.findAll();
		model.addAttribute("books", books);
		return "books";
	}
	
	
}

//@GetMapping
//public String listProducts(Model model) {
//	List<Product> products = productsRepository.findAll();
//	model.addAttribute("products", products);
//	return "products";
//}