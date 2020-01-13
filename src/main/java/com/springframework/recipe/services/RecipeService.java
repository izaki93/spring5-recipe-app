package com.springframework.recipe.services;

import com.springframework.recipe.commands.RecipeCommand;
import com.springframework.recipe.domain.Recipe;

import java.util.Optional;
import java.util.Set;

/**
 * @author Ibrahim
 * @created 26/12/2019 - 12:49 PM
 * @project spring5-recipe-app
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long id);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    RecipeCommand findCommandById(Long id);
}
