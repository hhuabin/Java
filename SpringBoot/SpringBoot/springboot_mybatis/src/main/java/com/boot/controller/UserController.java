package com.boot.controller;

import com.boot.bean.User;
import com.boot.controller.utils.R;
import com.boot.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author bin
 * @date 2023-02-08-15:58
 */
@Slf4j                // 引入打印日志的包
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * @RequestMapping
     *  value
     *  method
     *  params
     *      "value": 当前请求中一定要携带该参数
     *      "!value": 当前请求中不能携带该参数
     *      "value=value"： 当前请求中一定要携带参数 value
     *      "value!=value"： 当前请求中不能携带参数 value
     * headers: 请求头，用法与 params 一样
     *      请求头错误 报404
     *
     * @RequestMapping(): value值支持设置一些特殊字符
     *  ?: 表示任意单个字符
     *  *: 表示任意个数任意字符
     *  **: 任意层数的任意目录，只能使用在双斜线中，前后不能有任意的其他字符，如 / ** /"test/
     * 路径中的占位符 {}, 配合 @PathVariable 使用
     *
     * @GetMapping @PostMapping @DeleteMapping @PutMapping
     */
    @RequestMapping("/search")
    public R getAll(HttpServletRequest request) throws IOException, InterruptedException {
//        String requestURI = request.getRequestURI();  // 获取请求路径
        String requestURL = request.getRequestURL().toString();  // 获取请求 URL
        Thread.sleep(3000);
        log.info("请求完整路径为：" + requestURL);
//        if (true) throw new IOException();
        R r = new R();
        r.setResult_code("0");
        r.setData(userService.list());
        System.out.println("search请求成功");
        return r;
    }

    @RequestMapping("/searchbyid")
    public User getUserById(@RequestParam("id") Long id) {
        User user = userService.getById(id);
        System.out.println(user);
        return user;
    }


    /**
     * @RequestBody: 将 json 格式的请求参数转化为 Java 对象
     *  有相对应的类请使用相对应的类，没有请使用 Map
     *  为 类 | Map 自动装配需要使用 jackson依赖
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public R save(@RequestBody User user) {
        R r = new R();
        userService.save(user);
        r.setResult_code("0");
        return r;
    }

    @RequestMapping("/update")
    public Boolean update(@RequestBody User user) {
        return userService.updateById(user);
    }

    /**
     * @RequestParam(value, required, defaultValue): 将 请求路径参数 和 控制器方法 的形参 绑定
     * value: 前端参数名
     * required: true | false
     *  true: 默认值，该参数必须要传
     *  false: 参数非必要，不传值为默认值
     * defaultValue: 参数默认值，此时和 required 的值无关
     *
     * @RequestHeader(value, required, defaultValue): 将 请求头信息 和 控制器方法 的形参 绑定
     *  用法与 @RequestParam 一样
     *
     * @CookieValue(value, required, defaultValue): 将 cookie数据 和 控制器方法 的形参 绑定
     *  用法与 @RequestParam 一样
     */
    @RequestMapping(value = "/delete", method = {RequestMethod.POST, RequestMethod.GET})
    public Boolean delete(@RequestParam("ids") Long ids, @RequestBody(required = false) Object id) {
        System.out.println(id);
        System.out.println(ids);
//        return false;
        return userService.removeById(ids);
    }
}
