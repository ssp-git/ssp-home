package com.lzj.springcloud.microserviceconsumerfeignhystrix.service;

import com.lzj.springcloud.microservicecom.bean.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConsumerServiceFallbackFactory  implements FallbackFactory<ConsumerService> {
    @Override
    public ConsumerService create(Throwable arg0) {
        // TODO Auto-generated method stub
        return new ConsumerService() {

            @Override
            public List<User> getAll() {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public User get(int id) {
                User user = new User(id, "该用户不存在", 0);
                return user;
            }

            @Override
            public boolean add(User user) {
                // TODO Auto-generated method stub
                return false;
            }
        };
    }

}
