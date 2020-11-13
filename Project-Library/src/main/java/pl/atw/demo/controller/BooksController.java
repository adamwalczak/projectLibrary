package pl.atw.demo.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
		
	@GetMapping("/page/{pageN}")
	public String pageBooks(Model model,
			@PathVariable("pageN") Integer pageN) {
		Page<Book> page = repo.findAll(PageRequest.of(pageN, 4));
		System.out.println(page.getContent());
		List<Book> books = page.getContent();
		//page.get
		model.addAttribute("books", books);
		model.addAttribute("pages", page);
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