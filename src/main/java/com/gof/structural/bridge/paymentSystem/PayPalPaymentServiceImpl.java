package com.gof.structural.bridge.paymentSystem;

import com.gof.PaymentType;
import com.gof.creational.common.AbstractOrder;

public class PayPalPaymentServiceImpl implements PaymentService {
    @Override
    public PaymentType pay(AbstractOrder abstractOrder) {
        System.out.println("pay order by PayPal");
        return PaymentType.PAYPAL;
    }

    @Override
    public void cancel(AbstractOrder order) {
        System.out.println("Cancel pay order by PayPal");
    }
}
