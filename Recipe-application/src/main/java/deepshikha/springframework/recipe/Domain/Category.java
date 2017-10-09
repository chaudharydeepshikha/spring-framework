package deepshikha.springframework.recipe.Domain;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Deepshikha chaudhary on 10/9/2017
 */
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }
}
