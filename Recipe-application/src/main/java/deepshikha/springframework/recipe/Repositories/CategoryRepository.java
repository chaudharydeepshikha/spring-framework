package deepshikha.springframework.recipe.Repositories;

import deepshikha.springframework.recipe.Domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Deepshikha chaudhary on 10/9/2017
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
