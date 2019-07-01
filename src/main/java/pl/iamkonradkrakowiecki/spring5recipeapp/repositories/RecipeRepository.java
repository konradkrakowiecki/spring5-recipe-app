package pl.iamkonradkrakowiecki.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.iamkonradkrakowiecki.spring5recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
