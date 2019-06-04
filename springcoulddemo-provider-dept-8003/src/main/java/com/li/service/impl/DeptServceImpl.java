package com.li.service.impl;

import com.li.dao.DeptMapper;
import com.li.entity.Dept;
import com.li.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;




@Service
public class DeptServceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;

    @Override
    public boolean add(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptMapper.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.findAll();
    }
}
