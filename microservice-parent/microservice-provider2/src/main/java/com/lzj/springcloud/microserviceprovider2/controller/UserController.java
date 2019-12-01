package com.lzj.springcloud.microserviceprovider2.controller;

import com.lzj.springcloud.microservicecom.bean.User;
import com.lzj.springcloud.microserviceprovider.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService service;

    @RequestMapping(value="/add", method=RequestMethod.POST)
    public boolean addUser(@RequestBody User user){
        boolean flag = service.addUser(user);
        return flag;
    }

    @RequestMapping(value="/get/{id}", method=RequestMethod.GET)
    public User getUser(@PathVariable("id") int id){
        User user = service.getUser(id);
        return user;
    }

    @RequestMapping(value="/getUser/list", method=RequestMethod.GET)
    public List<User> getUsers(){
        List<User> users = service.getUsers();
        return users;
    }

}
