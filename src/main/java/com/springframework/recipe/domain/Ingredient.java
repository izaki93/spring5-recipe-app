package com.springframework.recipe.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author Ibrahim
 * @created 25/12/2019 - 3:40 PM
 * @project spring5-recipe-app
 */
@Data
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;
    @ManyToOne
    private Recipe recipe;
    //Fetch Type of one-to-one by default is eager but we can explicitly define it
    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure unitOfMeasure;

    public Ingredient() {
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure unitOfMeasure) {
        this.description =description;
        this.amount =amount;
        this.unitOfMeasure =unitOfMeasure;
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure unitOfMeasure, Recipe recipe) {
        this.description =description;
        this.amount =amount;
        this.unitOfMeasure =unitOfMeasure;
        this.recipe =recipe;
    }
}
