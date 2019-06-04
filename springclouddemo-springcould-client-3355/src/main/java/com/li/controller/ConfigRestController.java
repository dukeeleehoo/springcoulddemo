package com.li.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class ConfigRestController {


    @Value("${server.port}")
    private String port;


    @Value("${eureka.client.server-url.defaultZone}")
    private String zone;





    @GetMapping("/config")
    public void getConfig(){
        System.out.println("配置：端口"+port +"eurka配置："+zone);
    }


}
