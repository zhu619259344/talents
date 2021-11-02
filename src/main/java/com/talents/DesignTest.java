package com.talents;

import com.talents.dao.mapper.UserMapper;
import com.talents.demo.designMode.Strategy.DiscountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignTest {

    @Autowired
    private DiscountService discountService;

    @Test
    public void testSelect() {
        discountService.discount("month");
    }

}