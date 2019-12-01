package com.lzj.springcloud.microserviceproviderhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class MicroserviceProviderHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProviderHystrixApplication.class, args);
    }

}
