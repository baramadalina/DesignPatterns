package com.madalina.model;

public class Ingredient {

    private INGREDIENT_NAME name;
    private int quantity;
    private double price;

    public Ingredient(INGREDIENT_NAME name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public INGREDIENT_NAME getName() {
        return name;
    }

    public void setName(INGREDIENT_NAME name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
