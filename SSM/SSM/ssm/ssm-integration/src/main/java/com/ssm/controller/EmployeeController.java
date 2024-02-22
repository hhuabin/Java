package com.ssm.controller;

import com.ssm.bean.Employee;
import com.ssm.common.R;
import com.ssm.service.EmployeePageService;
import com.ssm.service.EmployeeService;
import com.ssm.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author bin
 * @date 2024-02-22 11:26
 */
@CrossOrigin           // 允许跨域
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeePageService employeePageService;

    public EmployeeController() {
    }

    @GetMapping("find")
    public List<Employee> find() {
        List<Employee> all = employeeService.findAll();
        return all;
    }

    @GetMapping("/page/{currentPage}/{pageSize}")
    public R page(@PathVariable int currentPage, @PathVariable int pageSize) {
        R page = employeePageService.page(pageSize, currentPage);
        return page;
    }
}
