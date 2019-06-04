package com.li;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableFeignClients
public class CustomerDeptFeign80Application {
    public static void main(String[] args) {
        SpringApplication.run(CustomerDeptFeign80Application.class, args);
    }
}
