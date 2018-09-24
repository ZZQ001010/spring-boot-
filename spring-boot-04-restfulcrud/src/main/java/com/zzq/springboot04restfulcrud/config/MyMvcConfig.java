package com.zzq.springboot04restfulcrud.config;

import com.zzq.springboot04restfulcrud.Interceptor.LoginHandlerInterceptor;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

        /**
         * @author ZZQ
         * @date 2018/9/1 20:46
         */
// 添加@EnableWebMvc  可以全面接管mvc  springboot 的任何配置都不生效
//配置类
//@EnableWebMvc
        @Configuration
        public class MyMvcConfig implements WebMvcConfigurer {

            @Bean
            public  WebServerFactoryCustomizer webServerFactoryCustomizer(){
                WebServerFactoryCustomizer<ConfigurableWebServerFactory> w =  factory  ->{
                    factory.setPort(8886);
                };

                return  w ;
            }



            //ctrl +  o  实现父类中的方法

            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/login").setViewName("login");
                registry.addViewController("/main.html").setViewName("main");
                registry.addViewController("/demo").setViewName("demo");
                registry.addViewController("/demo2").setViewName("demo2");

            }


/*            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/index.html","/","/login","/user/login","/asserts/**","/demo.html");
            }*/
        }
