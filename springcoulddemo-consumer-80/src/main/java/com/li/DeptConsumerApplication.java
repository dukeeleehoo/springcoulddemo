package com.li;

import com.li.ribbonrules.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Hello world!
 *
 */





@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SPRINGCOULDDEMO-DEPT-PROVIDER",configuration = MyRule.class)
//@EnableFeignClients
public class DeptConsumerApplication
{
    public static void main( String[] args )
    {
        System.out.println("11");
        SpringApplication.run(DeptConsumerApplication.class, args);
    }
}
