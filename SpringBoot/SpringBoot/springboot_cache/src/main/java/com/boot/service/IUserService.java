package com.boot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.boot.bean.User;

/**
 * @author bin
 * @date 2023-02-08-15:29
 */

/**
 * Mybatis-plus 用法
 * 继承 IService
 * IUserService拥有了基本的增删改方法
 */
public interface IUserService extends IService<User> {
    public User getUserById(Integer id);
}
