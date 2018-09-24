package com.zzq.springboot06jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author ZZQ
 * @date 2018/9/4 11:44
 */
@RestController
public class helloWorldController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/jdbc")
    public Map hello(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from department");
        return  maps.get(0);
    }
}
