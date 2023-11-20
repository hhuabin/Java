package com.boot.springweb.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.boot.springweb.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author bin
 * @date 2022-11-24-15:28
 */
// mybatis-plus 应用

/**
 * 继承了 BaseMapper 就拥有了 CURD 能力
 * 实现请看 -> SpringWebApplicationTests
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
