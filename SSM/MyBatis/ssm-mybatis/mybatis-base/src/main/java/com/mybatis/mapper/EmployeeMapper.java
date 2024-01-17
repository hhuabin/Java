package com.mybatis.mapper;

import com.mybatis.bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author bin
 * @date 2024-01-15 17:35
 */
public interface EmployeeMapper {

    Employee selectEmployee(@Param("name") String name, @Param("empId") Integer empId);

    int insertEmp(Employee employee);

    List<Employee> selectAllEmployee();

}
