package com.boot;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.boot.bean.User;
import com.boot.dao.UserDao;
import com.boot.dao.UserPlusDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.function.Consumer;

//@SpringBootTest
@SpringBootTest(properties = {"test.a=1"}, args = {"--b=3"})
@Transactional          // 测试用例的事务回滚
class ApplicationTests {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserPlusDao userPlusDao;

    @Value("${test.a}")
    private String a;
    @Value("${b}")
    private String b;

    // 测试临时属性
    @Test
    void testLinShi() {
        System.out.println(a + ' ' + b);
    }



    @Test
    void contextLoads() {
        User user = userDao.getUserById(1);
        System.out.println(user);
    }

    // MybatisPlus
    @Test
    void testGetById() {
        User user = userPlusDao.selectById(1);
        System.out.println(user);
    }

    @Test
    void testSave() {
        User user = new User();
        user.setName("bin");
        user.setAge(18);
        user.setEmail("123456789");
        userPlusDao.insert(user);
    }

    @Test
    void testUpdate() {
        User user = new User();
        user.setId(7l);
        user.setName("bin");
        user.setAge(15);
        user.setEmail("");
        userPlusDao.updateById(user);
    }

    @Test
    void testDeleteById() {
        userPlusDao.deleteById(6);
    }

    @Test
    void testGetAll() {
        List<User> userList = userPlusDao.selectList(null);
//        userList.forEach(System.out::println);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    void testGetPage() {
        IPage page = new Page(1, 3);

        userPlusDao.selectPage(page, null);

        System.out.println(page.getRecords());
    }

    // 条件查询
    @Test
    void testGetBy() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", "bin");
        List<User> userList = userPlusDao.selectList(queryWrapper);
//        userList.forEach(user -> System.out.println(user));
        userList.forEach(new Consumer<User>(){
            @Override
            public void accept(User user) {
                System.out.println(user);
            }
        });
    }

    // 安全条件查询
    @Test
    void testGetBy2() {
        String name = "bin";
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(name != null, User::getName, name);
        List<User> userList = userPlusDao.selectList(lambdaQueryWrapper);
        userList.forEach(System.out::println);
    }

}
