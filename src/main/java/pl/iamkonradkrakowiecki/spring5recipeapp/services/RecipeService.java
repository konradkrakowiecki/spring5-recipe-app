package pl.iamkonradkrakowiecki.spring5recipeapp.services;

import pl.iamkonradkrakowiecki.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
