package com.lzj.springcloud.microserviceconsumerhystrixdashbord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class MicroserviceConsumerHystrixDashbordApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerHystrixDashbordApplication.class, args);
    }

}
