package com.ssm.service;

import com.ssm.bean.Employee;

import java.util.List;

/**
 * @author bin
 * @date 2024-02-22 11:26
 */
public interface EmployeeService {

    List<Employee> findAll();
}
