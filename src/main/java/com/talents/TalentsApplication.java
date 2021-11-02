package com.talents;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("com.talents.dao.mapper")
@SpringBootApplication
@EnableScheduling
public class TalentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TalentsApplication.class, args);
    }

}
