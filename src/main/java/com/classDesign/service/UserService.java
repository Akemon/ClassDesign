package com.classDesign.service;

import com.classDesign.bean.User;
import com.classDesign.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    @Autowired
    public UserMapper userMapper;

    public boolean userLogin(String userName,String userPass){
        if(userMapper.userLogin(userName,userPass)!=null) return true;
        return false;
    }
    public User selectOneUser(int id){
        return userMapper.selectByPrimaryKey(id);
    }
}
