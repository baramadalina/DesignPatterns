package com.madalina.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public abstract class Pizza {

    protected String type;
    protected String dough;
    protected String sauce;
    protected String topping;
    protected List<Ingredient> ingredients;
    protected Size size;

    private List<Observer> users = new ArrayList<>();

    public Pizza(String dough, String sauce, String topping) {
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    public Pizza(String type) {
        this.type = type;
    }

    public Pizza() {}

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public abstract void addIngredients();

    public abstract void preparePizza();

    public abstract void boxPizza();

    public abstract void deliverPizza();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pizza{");
        sb.append("dough='").append(dough).append('\'');
        sb.append(", sauce='").append(sauce).append('\'');
        sb.append(", topping='").append(topping).append('\'');
        sb.append(", ingredients=").append(ingredients);
        sb.append('}');
        return sb.toString();
    }
}
