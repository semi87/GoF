package com.gof.behavioral.observer;

public class CustomerDisplay extends Observer {
    @Override
    public void update(String str) {
        System.out.println("Customer display:" + str);
    }
}
