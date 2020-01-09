package com.springframework.recipe.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Ibrahim
 * @created 26/12/2019 - 7:55 AM
 * @project spring5-recipe-app
 */
@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;
}
