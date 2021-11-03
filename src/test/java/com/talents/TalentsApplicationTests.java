package com.talents;

import com.talents.demo.designMode.observer.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TalentsApplicationTests {

    @Autowired
    OrderService orderService;

    @Test
    void contextLoads(){
        orderService.makeOrder();
    }
}
