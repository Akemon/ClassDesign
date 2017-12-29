package com.classDesign;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.classDesign.dao")
public class springBootApplication {
    public static void main(String[] args){
        SpringApplication.run(springBootApplication.class,args);
    }
}
