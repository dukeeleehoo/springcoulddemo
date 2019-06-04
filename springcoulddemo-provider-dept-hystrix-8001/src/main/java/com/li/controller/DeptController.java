package com.li.controller;


import com.li.entity.Dept;
import com.li.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;


    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept)
    {
        return deptService.add(dept);
    }


    @HystrixCommand(fallbackMethod = "depterror")
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id)
    {
        Dept dept = deptService.get(id);
        if(null==dept){
            throw new NullPointerException();
        }

        return dept;
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list()
    {
        return deptService.list();
    }

    @RequestMapping("/dept/discovery")
    public Object discovery(){
        List<String> stringList = discoveryClient.getServices();
        System.out.println(stringList);
        List<ServiceInstance>     list =     discoveryClient.getInstances("SPRINGCOULDDEMO-DEPT-PROVIDER");

        for(ServiceInstance s:list){
            System.out.println(s.getServiceId() + s.getHost() + s.getPort() + s.getUri());

        }
        return this.discoveryClient;
    }


    public Dept depterror(@PathVariable("id")Long id){
        Dept dept = new Dept();
        dept.setDeptno(id);
        dept.setDname("没有此部门");
        return dept;
    }
}
