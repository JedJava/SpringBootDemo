package com.xujie.dao;

import com.xujie.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:
 * @author: JedX
 * @create: 2021-03-16 21:45
 */
@Mapper
public interface UserDao {

    List<User> findUsers();
}
