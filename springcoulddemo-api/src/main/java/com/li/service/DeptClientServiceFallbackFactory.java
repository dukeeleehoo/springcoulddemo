package com.li.service;

import com.li.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {


    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get( long id) {
                Dept dept = new Dept();
                dept.setDeptno(id);
                dept.setDname("没有此部门");
                return dept;
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Object discovery() {
                return null;
            }
        };
    }
}
