package com.talents;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.talents.dao.mapper")
@SpringBootApplication
public class TalentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TalentsApplication.class, args);
    }

}
