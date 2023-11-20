package com.boot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boot.bean.User;
import com.boot.dao.UserPlusDao;
import com.boot.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author bin
 * @date 2023-02-08-15:32
 */
@Service
public class UserServiceImpl2 extends ServiceImpl<UserPlusDao, User> implements IUserService {
}
