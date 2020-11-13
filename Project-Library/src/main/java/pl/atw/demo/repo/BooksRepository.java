package pl.atw.demo.repo;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import pl.atw.demo.model.Book;

@Repository
public interface BooksRepository extends PagingAndSortingRepository<Book, Integer> {

	Page<Book> findAll(Pageable page);
}
