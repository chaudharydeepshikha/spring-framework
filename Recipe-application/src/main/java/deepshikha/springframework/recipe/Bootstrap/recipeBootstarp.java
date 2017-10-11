package deepshikha.springframework.recipe.Bootstrap;

import deepshikha.springframework.recipe.Domain.Difficulty;
import deepshikha.springframework.recipe.Domain.Ingredient;
import deepshikha.springframework.recipe.Domain.Notes;
import deepshikha.springframework.recipe.Domain.Recipe;
import deepshikha.springframework.recipe.Repositories.CategoryRepository;
import deepshikha.springframework.recipe.Repositories.RecipeRepository;
import deepshikha.springframework.recipe.Repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author Deepshikha chaudhary on 10/11/2017
 */
@Component
public class recipeBootstarp implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    @Autowired
    private UnitOfMeasureRepository unitOfMeasureRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private RecipeRepository recipeRepository;


    public void initData() {

        Recipe recipe = new Recipe();
        recipe.setDescription("Let's try this amazing recipe");
        recipe.setPrepTime(10);
        recipe.setCookTime(30);
        recipe.setServings(4);
        recipe.setSource("simplyrecipes");
        recipe.setUrl("www.simplyrecipes.com/");
        recipe.setDirections("1 Cut avocado, remove flesh: Cut the avocados in half. Remove seed. Score the inside of the avocado with a blunt knife and scoop out the flesh with a spoon. Place in a bowl.\n" +
                "2 Mash with a fork: Using a fork, roughly mash the avocado. (Don't overdo it! The guacamole should be a little chunky.)\n" +
                "3 Add salt, lime juice, and the rest: Sprinkle with salt and lime (or lemon) juice. The acid in the lime juice will provide some balance to the richness of the avocado and will help delay the avocados from turning brown.\n" +
                "Add the chopped onion, cilantro, black pepper, and chiles. Chili peppers vary individually in their hotness. So, start with a half of one chili pepper and add to the guacamole to your desired degree of hotness.\n" +
                "Remember that much of this is done to taste because of the variability in the fresh ingredients. Start with this recipe and adjust to your taste.\n" +
                "4 Cover with plastic and chill to store: Place plastic wrap on the surface of the guacamole cover it and to prevent air reaching it. (The oxygen in the air causes oxidation which will turn the guacamole brown.) Refrigerate until ready to serve.\n" +
                "Chilling tomatoes hurts their flavor, so if you want to add chopped tomato to your guacamole, add it just before serving.");

        recipe.setImage(null);
        recipe.setDifficulty(Difficulty.KIND_OF_HARD);

        recipe.addIngredients(new Ingredient("ripe Avocados", new BigDecimal("1"), unitOfMeasureRepository.findByDescription("Number").get()));
        recipe.addIngredients(new Ingredient("fresh lime juice", new BigDecimal("1"), unitOfMeasureRepository.findByDescription("Tablespooon").get()));
        recipe.addIngredients(new Ingredient("cilantro (leaves and tender stems)", new BigDecimal("1"), unitOfMeasureRepository.findByDescription("Tablespooon").get()));

        recipe.getCategories().add(categoryRepository.findByDescription("American").get());
        recipe.getCategories().add(categoryRepository.findByDescription("Italian").get());

        Notes notes = new Notes("For a very quick guacamole just take a 1/4 cup of salsa and mix it in with your mashed avocados.\n" +
                "Feel free to experiment! One classic Mexican guacamole has pomegranate seeds and chunks of peaches in it (a Diana Kennedy favorite). Try guacamole with added pineapple, mango, or strawberries.\n" +
                "The simplest version of guacamole is just mashed avocados with salt. Don't let the lack of availability of other ingredients stop you from making guacamole.\n" +
                "To extend a limited supply of avocados, add either sour cream or cottage cheese to your guacamole dip. Purists may be horrified, but so what? It tastes great.");

        recipe.setNotes(notes);
        recipeRepository.save(recipe);

    }
}
