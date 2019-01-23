package com.gof.structural.decorator.paymentSystem;

import com.gof.structural.decorator.Service;
import com.gof.structural.decorator.SiteServiceDecor;

public class PayPalPaymentServiceImpl extends SiteServiceDecor {

    public PayPalPaymentServiceImpl(Service service) {
        super(service);
    }

    @Override
    public void activate() {
        super.activate();
        System.out.println(" - Add PayPal payment system");
    }
}
