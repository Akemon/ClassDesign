package com.classDesign.dao;

import com.classDesign.bean.User;
import com.classDesign.bean.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //用户登陆
    @Select("select * from user where userName=#{userName} and userPass =#{userPass}")
    @ResultMap("BaseResultMap")
    User userLogin(@Param("userName") String userName,@Param("userPass") String userPass);

    //用户注册
    @Insert("insert into user(userName,userPass,province) values(#{username},#{userpass},#{province})")
    void userRegister(User user);

    //查看某个用户名是否存在
    @Select("select * from user where userName =#{username}")
    User checkUser(User user);
}