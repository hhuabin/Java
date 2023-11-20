package com.boot.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.boot.bean.User;

import java.util.List;

/**
 * @author bin
 * @date 2023-02-08-11:05
 */
public interface UserService {
    Boolean saveUser(User user);
    Boolean updateUser(User user);
    Boolean deleteUser(Integer id);
    User getById(Integer id);
    List<User> getAll();
    IPage<User> getPage(int currentPage, int pageSize);
}
