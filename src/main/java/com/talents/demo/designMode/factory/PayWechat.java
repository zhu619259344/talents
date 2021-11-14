package com.talents.demo.designMode.factory;

import org.springframework.stereotype.Service;

@Service
public class PayWechat implements Pay {
    @Override
    public void createOrder() {
        System.out.println("创建微信订单");
    }

    @Override
    public String getType() {
        return "wechat";
    }
}
