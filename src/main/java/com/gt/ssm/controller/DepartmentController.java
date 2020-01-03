package com.gt.ssm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: wb_cheng
 * @Date: 2020/1/3 16:30
 * @Description:
 */
@Controller
public class DepartmentController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        System.out.println("test add");
        return "list";
    }

}
