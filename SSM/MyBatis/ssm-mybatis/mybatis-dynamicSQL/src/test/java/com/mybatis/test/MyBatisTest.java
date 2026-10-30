package com.mybatis.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatis.bean.Employee;
import com.mybatis.mapper.DynamicSQLMapper;
import com.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bin
 * @date 2024-01-17 15:28
 */
public class MyBatisTest {

    @Test
    public void selectEmployeeByCondition() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

        Employee employee = new Employee();
        // 如果 empId 小于0，mybatis 会自动删除多余的 and
        employee.setEmpId(-1);
        employee.setEmpName("");

        List<Employee> employeeList = mapper.getEmployeeByCondition(employee);

        sqlSession.close();
        employeeList.forEach(System.out::println);
    }

    @Test
    public void updateEmployeeByCondition() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

        Employee employee = new Employee();
        employee.setEmpId(3);
        employee.setEmpName("bin");

        mapper.updateEmployee(employee);
        sqlSession.close();
    }

    @Test
    public void insertEmployeeList() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

        ArrayList<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee("bin1", 10.0);
        Employee employee2 = new Employee("bin2", 20.0);
        employees.add(employee1);
        employees.add(employee2);

        int i = mapper.insertEmployees(employees);
        sqlSession.close();
        System.out.println("result = " + i);
    }

    @Test
    public void testPageHelper() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

        // 在查询功能开始之前开启分页功能，当前是第几页，获取几条数据
        PageHelper.startPage(2, 4);

        Employee employee = new Employee();

        // 获取分页后的数据
        List<Employee> employeeList = mapper.getEmployeeByCondition(employee);
        employeeList.forEach(System.out::println);

        // 将查询后的分页数据封装到 PageInfo 实体类中
        PageInfo<Employee> pageInfo = new PageInfo<>(employeeList);

        // 当前页数据
        List<Employee> list = pageInfo.getList();
        // 总页数
        int pages = pageInfo.getPages();
        System.out.println("总页数 = " + pages);
        // 总条数
        long total = pageInfo.getTotal();
        System.out.println("总条数 = " + total);
        // 当前页数
        int pageNum = pageInfo.getPageNum();
        System.out.println("当前页数 = " + pageNum);
        // 每页的记录数
        int pageSize = pageInfo.getPageSize();
        System.out.println("每页的记录数 = " + pageSize);
        // 是否有下一页
        boolean hasNextPage = pageInfo.isHasNextPage();
        System.out.println("是否有下一页 = " + hasNextPage);

        sqlSession.close();
    }
}
