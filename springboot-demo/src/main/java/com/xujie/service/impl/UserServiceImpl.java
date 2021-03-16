package com.xujie.service.impl;

import com.xujie.dao.UserDao;
import com.xujie.pojo.User;
import com.xujie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: JedX
 * @create: 2021-03-16 21:53
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserDao userDao;

    @Override
    public List<User> findUsers() {
        return userDao.findUsers();
    }
}
