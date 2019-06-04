package com.li;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Config7001EurekaApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(Config7001EurekaApplication.class, args);
    }
}
