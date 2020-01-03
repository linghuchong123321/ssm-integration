package com.gt.ssm.controller;

import com.gt.ssm.bean.Department;
import com.gt.ssm.bean.Employee;
import com.gt.ssm.service.DepartmentService;
import com.gt.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Auther: wb_cheng
 * @Date: 2020/1/2 11:33
 * @Description:
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Map<String, Object> map) {
        map.put("employees", employeeService.getAll());
        return "list";
    }

//    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @PostMapping("/add")
    public String add(Employee employee) {
        employeeService.add(employee);
        return "redirect:/list";
    }



//    @DeleteMapping
//    @PostMapping
    @GetMapping(value = "/add")
    public String toAddPage(Map<String, Object> map) {
        //查询所有部门信息
        List<Department> departments = departmentService.getAll();
        map.put("departments", departments);
        return "input";
    }


//    @ResponseBody
//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public List<Employee> list() {
//        return employeeService.getAll();
//    }

}
