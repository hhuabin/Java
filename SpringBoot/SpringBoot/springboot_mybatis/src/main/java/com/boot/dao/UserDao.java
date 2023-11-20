package com.boot.dao;

import com.boot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author binww
 * @date 2023-02-07-10:16
 */
@Mapper
public interface UserDao {

    @Select("select * from user where id=#{id}")
    public User getUserById(Integer id);
}
