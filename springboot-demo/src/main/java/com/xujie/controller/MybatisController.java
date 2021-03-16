package com.xujie.controller;

import com.xujie.pojo.User;
import com.xujie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: JedX
 * @create: 2021-03-15 22:04
 */
@RestController
@RequestMapping("/user")
public class MybatisController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<User> findUsers(){
        return userService.findUsers();
    }

}
