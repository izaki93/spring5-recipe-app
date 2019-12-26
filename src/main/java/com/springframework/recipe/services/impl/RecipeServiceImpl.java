package com.springframework.recipe.services.impl;

import com.springframework.recipe.domain.Recipe;
import com.springframework.recipe.repositories.RecipeRepository;
import com.springframework.recipe.services.RecipeService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ibrahim
 * @created 26/12/2019 - 12:50 PM
 * @project spring5-recipe-app
 */
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipes = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }
}
