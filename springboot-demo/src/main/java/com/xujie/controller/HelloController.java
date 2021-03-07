package com.xujie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: JedX
 * @create: 2021-03-07 22:18
 */
@RestController//复合注解，有controller和responseBody
public class HelloController {

    @RequestMapping("/spring/boot")
    public String boot(){
        return "Hello Spring Boot";
    }
}
