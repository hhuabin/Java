package com.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.bean.Employee;
import com.ssm.bean.PageBean;
import com.ssm.common.R;
import com.ssm.mapper.EmployeeMapper;
import com.ssm.service.EmployeePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bin
 * @date 2024-02-22 14:50
 */
@Service
public class EmployeePageServiceImpl implements EmployeePageService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public R page(int pageSize, int currentPage) {

        PageHelper.startPage(currentPage, pageSize);

        List<Employee> employees = employeeMapper.queryList();

        PageInfo<Employee> employeePageInfo = new PageInfo<>(employees);

        PageBean<Employee> employeePageBean = new PageBean<>(currentPage, pageSize, employeePageInfo.getTotal(), employeePageInfo.getList());

        R<PageBean<Employee>> success = R.success(employeePageBean);

        return success;
    }
}
