package com.talents.demo.designMode.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * 观察者设计模式
 */
@Service
public class OrderService {

    @Autowired
    private ApplicationContext applicationContext;

    public void makeOrder(){
        System.out.println("创建订单～～～～");
        //发布事件
        applicationContext.publishEvent(new OrderEvent(applicationContext));
    }
}
