package com.talents.demo.designMode.Strategy;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DiscountService {

    private Map<String, DiscountStrategy> map = new HashMap<>();

    public DiscountService(List<DiscountStrategy> discountStrategyList) {
        for (DiscountStrategy discountStrategy:discountStrategyList){
            map.put(discountStrategy.getType(), discountStrategy);
        }
    }

    /**
     * 结算，需要传入会员的类型
     * @param type
     */
    public void discount(String type){
        DiscountStrategy discountStrategy = map.get(type);
        discountStrategy.doDiscount();
    }

    @Scheduled(fixedDelay = 100)
    public void fn(){
        discount(MembersTypeEnum.month.name());
    }
}
