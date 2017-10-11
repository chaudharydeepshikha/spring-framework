package deepshikha.springframework.recipe.Domain;

import javax.persistence.*;

/**
 * @author Deepshikha chaudhary on 10/8/2017
 */
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

    public Notes() {
    }

    public Notes(Recipe recipe, String recipeNotes) {
        this.recipe = recipe;
        this.recipeNotes = recipeNotes;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
