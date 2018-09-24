package com.zzq.springboot04restfulcrud.config;

import com.zzq.springboot04restfulcrud.filter.MyFilter;
import com.zzq.springboot04restfulcrud.listener.MyListener;
import com.zzq.springboot04restfulcrud.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author ZZQ
 * @date 2018/9/3 11:20
 * 注册Serlvet 三大组件
 */
@Configuration
public class MyServletConfig {

    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        return  new ServletRegistrationBean(new MyServlet(),"/MyServlet");
    }

    @Bean
    public FilterRegistrationBean FilterRegistrationBean (){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/MyServlet"));
        return  filterRegistrationBean;
    }

    public ServletListenerRegistrationBean servletListenerRegistrationBean(){
      return  new ServletListenerRegistrationBean(new MyListener());
    }



}
