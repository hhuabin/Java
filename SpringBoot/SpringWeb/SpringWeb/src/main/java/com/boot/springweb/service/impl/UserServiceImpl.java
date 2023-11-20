package com.boot.springweb.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boot.springweb.bean.User;
import com.boot.springweb.dao.UserMapper;
import com.boot.springweb.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author bin
 * @date 2023-01-30-22:17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
