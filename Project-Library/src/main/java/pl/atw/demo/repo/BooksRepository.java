package pl.atw.demo.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.atw.demo.model.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {

}
