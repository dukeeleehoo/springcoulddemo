package com.li.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Accessors(chain=true)
public class Dept implements Serializable {
    private String dname;
    private Long deptno;
    private String dbSource;

}

