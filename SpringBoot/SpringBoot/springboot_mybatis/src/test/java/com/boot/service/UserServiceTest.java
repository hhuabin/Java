package com.boot.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.boot.bean.User;
import com.boot.dao.UserPlusDao;
import com.boot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author bin
 * @date 2023-02-08-14:52
 */
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void testGetById() {
        User user = userService.getById(1);
        System.out.println(user);
    }

    @Test
    void testSave() {
        User user = new User();
        user.setName("bin");
        user.setAge(18);
        user.setEmail("123456789");
        userService.saveUser(user);
    }

    @Test
    void testUpdate() {
        User user = new User();
        user.setId(7l);
        user.setName("bin");
        user.setAge(15);
        user.setEmail("");
        userService.updateUser(user);
    }

    @Test
    void testDeleteById() {
        userService.deleteUser(6);
    }

    @Test
    void testGetAll() {
        List<User> userList = userService.getAll();
//        userList.forEach(System.out::println);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    void testGetPage() {
        IPage<User> page = userService.getPage(1, 3);
        System.out.println(page.getRecords());
    }

}
