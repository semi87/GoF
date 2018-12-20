package com.test.gof.creational.common;

public class CreditCardPayment implements PaymentSystem {
    @Override
    public String getType() {
        return "credit card";
    }
}
