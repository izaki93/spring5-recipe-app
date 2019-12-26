package com.springframework.recipe.repositories;

import com.springframework.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author Ibrahim
 * @created 26/12/2019 - 8:29 AM
 * @project spring5-recipe-app
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
