package com.springframework.recipe.repositories;

import com.springframework.recipe.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Ibrahim
 * @created 26/12/2019 - 8:31 AM
 * @project spring5-recipe-app
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
