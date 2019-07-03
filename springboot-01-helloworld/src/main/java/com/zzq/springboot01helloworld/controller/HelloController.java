package com.zzq.springboot01helloworld.controller;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;
        import org.springframework.web.client.RestTemplate;

/**
 * @author ZZQ
 * @date 2018/8/27 21:12
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return  "Hello world";
    }

}
