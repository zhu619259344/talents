package com.talents.demo.designMode.Strategy;

import org.springframework.stereotype.Service;

@Service
public class MonthMembers implements DiscountStrategy {

    @Override
    public void doDiscount() {
        System.out.println("月会员打对折！！");
    }

    @Override
    public String getType() {
        return MembersTypeEnum.month.name();
    }
}
