package com.talents.demo.designMode.factory;

import org.springframework.stereotype.Component;

@Component
public interface Pay {

    void createOrder();

    String getType();
}
