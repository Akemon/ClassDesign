package com.classDesign.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class TestController2 {

    @RequestMapping("/hk2")
    public String  hkTest(){
        return "Hello hk2!!!";
    }

}
