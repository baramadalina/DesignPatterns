package com.madalina.factory;

import com.madalina.model.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {

        Pizza pizza ;
        switch (type) {
            case "napolitan":
                pizza = new NapolitanPizza();
                break;
            case "chicago":
                pizza = new ChicagoPizza();
                break;
            case "newYork":
                pizza = new NewYorkStylePizza();
                break;
            case "sicilian":
                pizza = new SicilianPizza();
                break;
            case "greek":
                pizza = new GreekPizza();
                break;
            default:
                throw new IllegalArgumentException("This pizza type is not present in our store.xss");
        }
        return pizza;
    }
}
