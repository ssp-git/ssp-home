package com.lzj.springcloud.microservicezull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //启动Zuul
public class MicroserviceZullApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceZullApplication.class, args);
    }

}
