package deepshikha.springframework.recipe.Controllers;

import deepshikha.springframework.recipe.Services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Deepshikha chaudhary on 10/3/2017
 */
@Controller
public class indexController {

    @Autowired
    private RecipeService recipeService;

    @RequestMapping(value="/recipe")
    public String getIndexRecipe(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
