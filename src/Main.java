import com.madalina.builder.PizzaBuilder;
import com.madalina.model.*;
import com.madalina.singleton.PizzaStore;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PizzaStore pizzaStore  = PizzaStore.getInstance();

        List<Ingredient> ingredients1 = new ArrayList<>();
        ingredients1.add(new Ingredient(INGREDIENT_NAME.BACON, 2, 20));
        ingredients1.add(new Ingredient(INGREDIENT_NAME.CHEESE, 1, 20));
        ingredients1.add(new Ingredient(INGREDIENT_NAME.BLACK_OLIVES, 1, 15));

        String pizza1Type = "newYork";
        Pizza pizza = new PizzaBuilder(pizza1Type, "Apple’s water used to make the dough that makes this pizza stand out",
                ingredients1, Size.STANDARD)
                .setSauce("ketchup").setTopping("mozzarella")
                .build(pizza1Type);

        pizzaStore.orderPizza(pizza, 3, PaymentType.CREDIT_CARD);
        pizza.preparePizza();
        pizza.boxPizza();
        pizza.deliverPizza();
        System.out.println("----------------------------------------------------");

        List<Ingredient> ingredients2 = new ArrayList<>();
        ingredients2.add(new Ingredient(INGREDIENT_NAME.BEEF, 2, 50));
        ingredients2.add(new Ingredient(INGREDIENT_NAME.CHEESE, 1, 20));
        ingredients2.add(new Ingredient(INGREDIENT_NAME.BLACK_OLIVES, 1, 15));
        ingredients2.add(new Ingredient(INGREDIENT_NAME.ONIONS, 1, 10));
        ingredients2.add(new Ingredient(INGREDIENT_NAME.BLACK_OLIVES, 1, 15));

        String pizza2Type = "greek";
        Pizza pizza2 = new PizzaBuilder(pizza2Type, "Lining the pan with oil also allows the bottom of the dough to fry while it bakes",
                ingredients2, Size.FAMILY)
                .setSauce("ketchup spicy").setTopping("pepperoni")
                .build(pizza2Type);

        pizzaStore.orderPizza(pizza2, 1, PaymentType.CASH);
        pizza.preparePizza();
        pizza.boxPizza();
        pizza.deliverPizza();
    }
}
