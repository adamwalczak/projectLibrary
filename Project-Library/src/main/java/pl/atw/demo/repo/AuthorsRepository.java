package pl.atw.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.atw.demo.model.Author;

public interface AuthorsRepository extends JpaRepository<Author, Integer>{

}
