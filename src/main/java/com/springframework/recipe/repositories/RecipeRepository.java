package com.springframework.recipe.repositories;

import com.springframework.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Ibrahim
 * @created 26/12/2019 - 8:28 AM
 * @project spring5-recipe-app
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
