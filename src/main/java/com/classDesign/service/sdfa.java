package com.classDesign.service;

import com.classDesign.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class sdfa {
    @Autowired
    private UserMapper userMapper;
    public boolean userLogin(String userName,String userPass){
        //  if(userMapper.userLogin(userName,userPass)!=null) return true;
        return false;
    }
}
