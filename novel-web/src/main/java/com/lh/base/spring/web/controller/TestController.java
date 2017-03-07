package com.lh.base.spring.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lh on 17-3-7.
 */
@RestController
@RequestMapping("/app/test")
public class TestController {

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String sayHello() {
        return "hello world";
    }
}
