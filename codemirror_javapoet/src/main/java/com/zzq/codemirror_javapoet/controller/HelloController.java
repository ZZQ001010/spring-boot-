package com.zzq.codemirror_javapoet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZZQ
 * @date 2018/8/29 17:49
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String test(){
        return "success!";
    }

}
