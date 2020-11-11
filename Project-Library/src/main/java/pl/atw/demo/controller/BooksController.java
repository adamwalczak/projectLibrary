package pl.atw.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.atw.demo.model.Book;
import pl.atw.demo.repo.BooksRepository;

@Controller
@RequestMapping("/books")
public class BooksController {

	@Autowired
	private BooksRepository repo;
	
	@GetMapping
	public String listBooks(Model model) {
		List<Book> books = repo.findAll();
		model.addAttribute("books", books);
		return "books";
	}
	
	@GetMapping("/{bookId}")
	public String oneBook(Model model,
		@PathVariable("bookId") Integer bookId){
		Optional<Book> maybeBook = repo.findById(bookId);
		model.addAttribute("book", maybeBook.get());
		return "book";
	}
	
}

//@GetMapping
//public String listProducts(Model model) {
//	List<Product> products = productsRepository.findAll();
//	model.addAttribute("products", products);
//	return "products";
//}