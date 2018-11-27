package com.madalina.builder;

import com.madalina.factory.SimplePizzaFactory;
import com.madalina.model.Ingredient;
import com.madalina.model.Pizza;
import com.madalina.model.Size;

import java.util.List;

public class PizzaBuilder {

    // required parameters
    private String type;
    private String dough;
    private Size size;
    private List<Ingredient> ingredients;
    // optional parameters
    private String sauce;
    private String topping;

    private SimplePizzaFactory simplePizzaFactory;

    public PizzaBuilder(String type, String dough, List<Ingredient> ingredients, Size size) {
        this.simplePizzaFactory = new SimplePizzaFactory();
        this.type = type;
        this.dough = dough;
        this.ingredients = ingredients;
        this.size = size;
    }

    public PizzaBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder setTopping(String topping) {
        this.topping = topping;
        return this;
    }

    public Pizza build(String pizzaType) {
        return simplePizzaFactory.createPizza(pizzaType);
    }
}
