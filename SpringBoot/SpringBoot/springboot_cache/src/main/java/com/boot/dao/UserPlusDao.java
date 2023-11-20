package com.boot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.boot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author bin
 * @date 2022-11-24-15:28
 */

// mybatis-plus 应用

/**
 * 继承了 BaseMapper 就拥有了 CURD 能力
 * 把基础的 sql 语句省略掉
 * 实现请看 -> ApplicationTests
 */
@Mapper
public interface UserPlusDao extends BaseMapper<User> {
    @Select("select * from user where id=#{id}")
    public User getUserById(Integer id);
}
