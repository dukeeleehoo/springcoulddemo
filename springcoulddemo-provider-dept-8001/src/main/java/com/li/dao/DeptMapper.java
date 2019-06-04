package com.li.dao;


import java.util.List;

import com.li.entity.Dept;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface DeptMapper
{
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
