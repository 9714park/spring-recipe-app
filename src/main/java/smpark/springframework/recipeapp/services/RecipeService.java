package smpark.springframework.recipeapp.services;

import smpark.springframework.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
