package com.classDesign.service;

import com.classDesign.bean.User;
import com.classDesign.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserMapper userMapper;

    /**
     * 用户登陆
     * @param userName 用户名
     * @param userPass 密码
     * @return
     */

    public boolean userLogin(String userName,String userPass){
        if(userMapper.userLogin(userName,userPass)!=null) return true;
        return false;
    }

    /**
     * 用户注册
     * @param user 用户对象
     * @return
     */
    public boolean userRegister(User user){
        userMapper.userRegister(user);
        return true;
    }

    /**
     * 检查用户是否重复
     * @param user
     * @return
     */
    public boolean checkUser(User user){
        //用户名已存在
        if(userMapper.checkUser(user)!=null) return false;
        return true;
    }

    public List<User>  getAllUser(){
        return userMapper.selectByExample(null);
    }

    public User selectOneUser(int id){
        return userMapper.selectByPrimaryKey(id);
    }
}
