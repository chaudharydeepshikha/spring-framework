package deepshikha.springframework.recipe.Controllers;

import deepshikha.springframework.recipe.Domain.Category;
import deepshikha.springframework.recipe.Domain.UnitOfMeasure;
import deepshikha.springframework.recipe.Repositories.CategoryRepository;
import deepshikha.springframework.recipe.Repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.CacheRequest;
import java.util.Optional;

/**
 * @author Deepshikha chaudhary on 10/3/2017
 */
@Controller
public class indexController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private UnitOfMeasureRepository unitOfMeasureRepository;

    @RequestMapping(value="/recipe")
    public String getIndexRecipe(){

        Optional<Category> category = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspooon");

        System.out.println("Category id is: "+ category.get().getId());
        System.out.println("Unit of Measure id is : "+ unitOfMeasure.get().getId());
        return "index";
    }
}
