package com.lzj.springcloud.microserviceprovider;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProviderApplication.class, args);
    }

}
