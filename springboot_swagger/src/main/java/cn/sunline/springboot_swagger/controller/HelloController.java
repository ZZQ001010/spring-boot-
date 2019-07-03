package cn.sunline.springboot_swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/hello")
    public String hello(){
        return  "hello";
    }
}
