package com.ideaout.dategirls;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@MapperScan("com.ideaout.dategirls.dao")
public class DategirlsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DategirlsApplication.class, args);
    }


}
