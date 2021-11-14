package com.talents.demo.designMode.factory;

import org.springframework.stereotype.Service;

@Service
public class PayAli implements Pay {
    @Override
    public void createOrder() {
        System.out.println("创建支付宝订单");
    }

    @Override
    public String getType() {
        return "ali";
    }
}
