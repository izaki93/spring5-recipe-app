package com.springframework.recipe.controllers;

import com.springframework.recipe.domain.Recipe;
import com.springframework.recipe.services.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IndexControllerTest {

    IndexController indexController;

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        indexController = new IndexController(recipeService);
    }

    @Test
    void getIndexPage() {

        String viewName = indexController.getIndexPage(model);
        assertEquals("index",viewName);
        verify(model,times(1)).addAttribute(eq("recipes"),anySet());
        verify(recipeService,times(1)).getRecipes();

    }
}