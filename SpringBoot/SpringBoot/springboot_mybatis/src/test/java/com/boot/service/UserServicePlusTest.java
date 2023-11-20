package com.boot.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.boot.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author bin
 * @date 2023-02-08-15:41
 */
@SpringBootTest
public class UserServicePlusTest {
    @Autowired
    private IUserService userService;

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
        userService.save(user);
    }

    @Test
    void testUpdate() {
        User user = new User();
        user.setId(7l);
        user.setName("bin");
        user.setAge(15);
        user.setEmail("");
        userService.updateById(user);
    }

    @Test
    void testDeleteById() {
        userService.removeById(6);
    }

    @Test
    void testGetAll() {
        List<User> userList = userService.list();
//        userList.forEach(System.out::println);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    void testGetPage() {
        IPage<User> page = new Page<User>(1, 3);
        userService.page(page);
        page.getRecords().forEach(System.out::println);
    }
}
