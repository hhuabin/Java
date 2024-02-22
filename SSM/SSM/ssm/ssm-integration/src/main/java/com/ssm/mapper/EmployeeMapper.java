package com.ssm.mapper;

import com.ssm.bean.Employee;

import java.util.List;

/**
 * @author bin
 * @date 2024-02-22 11:22
 */
public interface EmployeeMapper {

    List<Employee> findAll();

    List<Employee> queryList();
}
