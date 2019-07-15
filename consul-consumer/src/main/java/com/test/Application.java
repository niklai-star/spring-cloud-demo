package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrix
public class Application {

    @Autowired
    private MFeignClient feignClient;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @GetMapping("/hello")
    public String hello() {
        return feignClient.hello();
    }
}
