package com.mybatis.mapper;

import com.mybatis.bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author bin
 * @date 2022-12-08-19:49
 */
public interface DynamicSQLMapper {

    /**
     * 根据条件查询员工信息
     * @param employee
     * @return
     */
    List<Employee> getEmployeeByCondition(Employee employee);

    void updateEmployee(Employee employee);

    int insertEmployees(@Param("employees") List<Employee> employees);
}
