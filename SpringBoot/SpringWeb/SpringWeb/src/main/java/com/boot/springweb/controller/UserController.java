package com.boot.springweb.controller;

import com.boot.springweb.annotation.CustomAnnotation;
import com.boot.springweb.bean.User;
import com.boot.springweb.request.UserReq;
import com.boot.springweb.response.UserResp;
import com.boot.springweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author bin
 * @date 2023-01-30-22:29
 */
@Controller
@RequestMapping("/user")
@CustomAnnotation(value = "bin")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @GetMapping("/getlist")
    public UserResp getUserList(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("/user/getlist 请求进来了");
        HttpSession session = request.getSession();
        System.out.println("sessionID: " + session.getId());

        UserResp userList = new UserResp();

        List<User> list = userService.list();

        userList.setUserList(list);
        userList.success();

        return userList;
    }

    @ResponseBody
    @GetMapping("/postlist")
    @CustomAnnotation(value = "bin")
    public UserResp PostUserList(HttpServletRequest request, HttpServletResponse response) {
//        System.out.println("请求进来了" + userReq.toString());

        Object userId = request.getAttribute("userId");
        System.out.println(userId);

        UserResp userList = new UserResp();

        List<User> list = userService.list();

        userList.setUserList(list);

        userList.success();

        return userList;
    }

}
