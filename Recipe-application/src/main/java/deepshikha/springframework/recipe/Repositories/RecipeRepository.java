package deepshikha.springframework.recipe.Repositories;

import deepshikha.springframework.recipe.Domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Deepshikha chaudhary on 10/9/2017
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long>{
}
