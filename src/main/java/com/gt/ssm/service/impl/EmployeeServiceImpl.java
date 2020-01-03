package com.gt.ssm.service.impl;

import com.gt.ssm.bean.Employee;
import com.gt.ssm.mapper.EmployeeMapper;
import com.gt.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Auther: wb_cheng
 * @Date: 2020/1/2 11:32
 * @Description:
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Map> getAll() {
        return employeeMapper.getAll();
    }

    @Override
    public void add(Employee employee) {
        employeeMapper.insertSelective(employee);
    }
}
