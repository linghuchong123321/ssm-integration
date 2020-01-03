package com.gt.ssm.service;

import com.gt.ssm.bean.Employee;

import java.util.List;
import java.util.Map;

/**
 * @Auther: wb_cheng
 * @Date: 2020/1/2 11:32
 * @Description:
 */
public interface EmployeeService {

    List<Map> getAll();

    void add(Employee employee);

}
