package com.li;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableHystrixDashboard
public class DashBord9001Application
{
    public static void main( String[] args )
    {
        SpringApplication.run(DashBord9001Application.class, args);
    }
}
