package com.talents.demo.designMode.Strategy;

import org.springframework.stereotype.Component;

@Component
public interface DiscountStrategy {

    void doDiscount();

    String getType();
}
