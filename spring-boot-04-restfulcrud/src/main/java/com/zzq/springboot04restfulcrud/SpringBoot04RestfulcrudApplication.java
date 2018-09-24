package com.zzq.springboot04restfulcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class SpringBoot04RestfulcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot04RestfulcrudApplication.class, args);
		System.out.println("...");
	}



	/**
	*   @author ZZQ
	*   @date 2018/9/1
	*   @description  自定义视图解析器
	*//*
	@Bean
	public ViewResolver MyViewResolver(){
	    return  new MyViewResolver() ;
    }

    public static  class MyViewResolver implements   ViewResolver {

        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }*/
}
