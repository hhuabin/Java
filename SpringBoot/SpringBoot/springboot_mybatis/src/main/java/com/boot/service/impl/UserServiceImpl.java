package com.boot.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.boot.bean.User;
import com.boot.dao.UserPlusDao;
import com.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bin
 * @date 2023-02-08-11:06
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserPlusDao userPlusDao;

    @Override
    public Boolean saveUser(User user) {
        return userPlusDao.insert(user) > 0;
    }

    @Override
    public Boolean updateUser(User user) {
        return userPlusDao.updateById(user) > 0;
    }

    @Override
    public Boolean deleteUser(Integer id) {
        return userPlusDao.deleteById(id) > 0;
    }

    @Override
    public User getById(Integer id) {
        return userPlusDao.selectById(id);
    }

    @Override
    public List<User> getAll() {
        return userPlusDao.selectList(null);
    }

    @Override
    public IPage<User> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        return userPlusDao.selectPage(page, null);
    }
}
