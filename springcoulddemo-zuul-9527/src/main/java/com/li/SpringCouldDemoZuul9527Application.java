package com.li;

import com.li.fileter.TokenFilter;
import com.netflix.zuul.ZuulFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */



@SpringBootApplication
@EnableZuulProxy
public class SpringCouldDemoZuul9527Application
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringCouldDemoZuul9527Application.class, args);
    }


    @Bean
    public ZuulFilter getZuulToken(){
        return new TokenFilter();
    }
}
