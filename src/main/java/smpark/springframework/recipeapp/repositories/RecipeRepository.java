package smpark.springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import smpark.springframework.recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
