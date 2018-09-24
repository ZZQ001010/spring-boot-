package com.zzq.springboot02config.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZZQ
 * @date 2018/8/28 11:41
 */

@RestController
public class HelloController{

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return  "new  hello";
    }
}
