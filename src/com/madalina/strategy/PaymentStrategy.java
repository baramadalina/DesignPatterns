package com.madalina.strategy;

import com.madalina.model.PaymentType;

public interface PaymentStrategy {

    void pay(PaymentType paymentType);
}
