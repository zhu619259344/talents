package com.talents.demo.designMode.Strategy;

import org.springframework.stereotype.Service;

@Service
public class YearMembers implements DiscountStrategy {

    @Override
    public void doDiscount() {
        System.out.println("年会员打骨折！！");
    }

    @Override
    public String getType() {
        return MembersTypeEnum.year.name();
    }
}
