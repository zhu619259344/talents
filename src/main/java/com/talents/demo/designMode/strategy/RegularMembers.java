package com.talents.demo.designMode.strategy;

import org.springframework.stereotype.Service;

@Service
public class RegularMembers implements DiscountStrategy {

    @Override
    public void doDiscount() {
        System.out.println("普通会员不打折～～");
    }

    @Override
    public String getType() {
        return MembersTypeEnum.regular.name();
    }
}
