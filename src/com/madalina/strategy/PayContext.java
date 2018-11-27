package com.madalina.strategy;

import com.madalina.model.PaymentType;

public class PayContext {

    //create an object of SingleObject
    private static final PayContext PAY_CONTEXT = new PayContext();

    //make the constructor private so that this class cannot be
    //instantiated
    private PayContext() {}

    //Get the only object available
    public static PayContext getContext() {
        return PAY_CONTEXT;
    }
    private PaymentStrategy paymentStrategy;

    private void setPaymentStrategy(PaymentType type) {
        if (type == PaymentType.CREDIT_CARD) {
            this.paymentStrategy = new CreditCardPayment();
        } else {
            this.paymentStrategy = new CashPayment();
        }
    }

    public void payPizza(PaymentType type) {
        setPaymentStrategy(type);
        paymentStrategy.pay(type);
    }
}
