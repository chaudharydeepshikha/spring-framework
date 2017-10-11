package deepshikha.springframework.recipe.Services;

import deepshikha.springframework.recipe.Domain.Recipe;

import java.util.Set;

/**
 * @author Deepshikha chaudhary on 10/11/2017
 */
public interface RecipeService {

    Set<Recipe>  getRecipes();
}
