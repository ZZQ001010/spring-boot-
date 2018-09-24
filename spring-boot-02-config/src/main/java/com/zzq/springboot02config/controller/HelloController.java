package com.zzq.springboot02config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZZQ
 * @date 2018/8/28 9:52
 */
@RestController
public class HelloController {

   @Value("${person.lastName}")
    private String name  ;


    @RequestMapping("/hello")
    public String hello(){
        return  "hello"+name ;
    }

}
