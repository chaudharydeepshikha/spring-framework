package deepshikha.spring.framework.springboot.Repositories;

import deepshikha.spring.framework.springboot.Model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
