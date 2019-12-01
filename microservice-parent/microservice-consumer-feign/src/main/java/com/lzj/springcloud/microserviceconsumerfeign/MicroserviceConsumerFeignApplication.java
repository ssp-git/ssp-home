package com.lzj.springcloud.microserviceconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages="com.lzj.springcloud.microserviceconsumerfeign.service")
public class MicroserviceConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerFeignApplication.class, args);
    }

}
