package com.classDesign.controller;

import com.classDesign.bean.Message;
import com.classDesign.bean.User;
import com.classDesign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userLogin")
    @ResponseBody
    public Message userLogin(HttpServletRequest request, @Valid User user, BindingResult result){
        if(result.hasErrors()) return Message.fail();
        if(userService.userLogin(user.getUsername(),user.getUserpass())) return Message.success();
        return Message.fail();
    }

    @RequestMapping("/userRegister")
    @ResponseBody
    public Message userRegister(HttpServletRequest request, @Valid User user, BindingResult result){
        //输入数据是否有误
        if(result.hasErrors()){
            //保存错误信息
            Map<String,Object> map =new HashMap<String,Object>();
            List<FieldError> fieldErrors = result.getFieldErrors();
            for(FieldError fieldError:fieldErrors){
                System.out.println("错误的字段名："+fieldError.getField());
                System.out.println("错误的信息："+fieldError.getDefaultMessage());
                map.put(fieldError.getField(),fieldError.getDefaultMessage());
            }
            return Message.fail().add("errorFields",map);
        }else{
            //用户名是否存在
            if(userService.checkUser(user)){
                userService.userRegister(user);
                return Message.success();
            }else{
                return Message.fail().add("error","用户名已存在");
            }

        }

    }





    @RequestMapping("/test")
    @ResponseBody
    public Message test(HttpServletRequest request){
        String userName =request.getParameter("id");
        if(userService.selectOneUser(Integer.parseInt(userName))!=null) return Message.success();
        return Message.fail();
    }
}
