package deepshikha.spring.framework.springboot.Repositories;

import deepshikha.spring.framework.springboot.Model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>{
}
