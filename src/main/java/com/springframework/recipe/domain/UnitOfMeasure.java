package com.springframework.recipe.domain;

import javax.persistence.*;

/**
 * @author Ibrahim
 * @created 25/12/2019 - 4:06 PM
 * @project spring5-recipe-app
 */
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
