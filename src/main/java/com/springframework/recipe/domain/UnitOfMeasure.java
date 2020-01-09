package com.springframework.recipe.domain;

import lombok.*;

import javax.persistence.*;

/**
 * @author Ibrahim
 * @created 25/12/2019 - 4:06 PM
 * @project spring5-recipe-app
 */
@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
}
