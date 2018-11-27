package com.madalina.strategy;

import com.madalina.model.PaymentType;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(PaymentType paymentType) {
        System.out.println("Pizza was payed with credit card");
    }
}
