package com.talents.demo.designMode.strategy;

import org.springframework.stereotype.Component;

@Component
public interface DiscountStrategy {

    void doDiscount();

    String getType();
}
