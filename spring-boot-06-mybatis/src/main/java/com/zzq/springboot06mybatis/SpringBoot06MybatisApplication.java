package com.zzq.springboot06mybatis;

import com.zzq.springboot06mybatis.entity.Person;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.zzq.springboot06mybatis.mapper"})
@SpringBootApplication
public class SpringBoot06MybatisApplication {

	public static void main(String[] args) {
        SpringApplication.run(SpringBoot06MybatisApplication.class, args);
        new Person().toString();
    }
}
