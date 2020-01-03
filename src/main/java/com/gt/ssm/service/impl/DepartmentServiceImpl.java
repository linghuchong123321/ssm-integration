package com.gt.ssm.service.impl;

import com.gt.ssm.bean.Department;
import com.gt.ssm.mapper.DepartmentMapper;
import com.gt.ssm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: wb_cheng
 * @Date: 2020/1/2 14:53
 * @Description:
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getAll() {
        return departmentMapper.selectByExample(null);
    }
}
