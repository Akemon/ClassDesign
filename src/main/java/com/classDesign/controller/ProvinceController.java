package com.classDesign.controller;

import com.classDesign.bean.Message;
import com.classDesign.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ProvinceController {

    @Autowired
    ProvinceService provinceService;

    @RequestMapping("/getAllProvinceAndPeople")
    @ResponseBody
    public Message getAllProvinceAndPeople(){
        return Message.success().add("result",provinceService.getAllProvinceAndPeople());
    }

}
