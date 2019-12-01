package com.lzj.springcloud.microserviceprovider2.dao;

import com.lzj.springcloud.microservicecom.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface  UserDao {
     boolean addUser(User user);

     User getUser(int id);

     List<User> getUsers();
}
