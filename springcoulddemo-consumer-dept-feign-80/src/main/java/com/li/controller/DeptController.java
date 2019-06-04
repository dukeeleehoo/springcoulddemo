package com.li.controller;


import com.li.entity.Dept;
import com.li.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {



    @Autowired
    private DeptClientService deptClientService;



    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept)
    {
        return deptClientService.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        Dept dept = deptClientService.get(id);
        if(null==dept){
            throw new RuntimeException();
        }
        return dept;
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list()
    {
        return deptClientService.list();
    }


    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/discovery")
    public Object discovery()
    {
        return deptClientService.discovery();
    }

}
