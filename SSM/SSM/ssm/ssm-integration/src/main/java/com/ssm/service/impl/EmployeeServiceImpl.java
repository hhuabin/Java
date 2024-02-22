package com.ssm.service.impl;

import com.ssm.bean.Employee;
import com.ssm.mapper.EmployeeMapper;
import com.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bin
 * @date 2024-02-22 11:40
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findAll() {
        List<Employee> all = employeeMapper.findAll();
        return all;
    }
}
