package com.boot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boot.bean.User;
import com.boot.dao.UserPlusDao;
import com.boot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author bin
 * @date 2023-02-08-15:32
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserPlusDao, User> implements IUserService {

    @Autowired
    public UserPlusDao userPlusDao;

    // 启用缓存
    @Cacheable(value = "cacheSpace", key = "#id")
    public User getUserById(Integer id) {
        return userPlusDao.getUserById(id);
    }
}
