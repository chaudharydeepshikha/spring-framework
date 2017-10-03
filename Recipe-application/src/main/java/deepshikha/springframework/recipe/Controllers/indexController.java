package deepshikha.springframework.recipe.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Deepshikha chaudhary on 10/3/2017
 */
@Controller
public class indexController {

    @RequestMapping(value="/recipe")
    public String getIndexRecipe(){
        return "index";
    }
}
