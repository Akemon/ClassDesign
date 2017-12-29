package com.classDesign.controller;

import com.classDesign.bean.Message;
import com.classDesign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userLogin")
    @ResponseBody
    public Message userLogin(HttpServletRequest request){
        String userName =request.getParameter("userName");
        String userPass =request.getParameter("userPass");
        if(userService.userLogin(userName,userPass)) return Message.success();
        return Message.fail();
    }

    @RequestMapping("/test")
    @ResponseBody
    public Message test(HttpServletRequest request){
        String userName =request.getParameter("id");
        if(userService.selectOneUser(Integer.parseInt(userName))!=null) return Message.success();
        return Message.fail();
    }
}
