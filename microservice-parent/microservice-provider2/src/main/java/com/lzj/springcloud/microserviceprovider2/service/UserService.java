package com.lzj.springcloud.microserviceprovider2.service;

import com.lzj.springcloud.microservicecom.bean.User;

import java.util.List;

public interface UserService {
     boolean addUser(User user);

     User getUser(int id);

     List<User> getUsers();
}
