package deepshikha.springframework.recipe.Services;

import deepshikha.springframework.recipe.Domain.Recipe;
import deepshikha.springframework.recipe.Repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author Deepshikha chaudhary on 10/11/2017
 */
@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    public Set<Recipe> getRecipes() {
//        return new HashSet<Recipe>((Collection<? extends Recipe>) recipeRepository.findAll());
        Set<Recipe> recipes = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }
}
