package com.madalina.singleton;

import com.madalina.model.PaymentType;
import com.madalina.model.Pizza;
import com.madalina.strategy.PayContext;

public class PizzaStore {

    private static PayContext payment;

    //create an object of SingleObject
    private static final PizzaStore STORE = new PizzaStore();

    //make the constructor private so that this class cannot be
    //instantiated
    private PizzaStore() {}

    //Get the only object available
    public static PizzaStore getInstance() {
        payment = PayContext.getContext();
        return STORE;
    }

    public void orderPizza(Pizza pizza, int quantity, PaymentType paymentType) {
        System.out.printf("Customer was ordered %d pizza %n", quantity);
        System.out.println("Customer will pay pizza "+ paymentType);
        payment.payPizza(paymentType);
    }
}
