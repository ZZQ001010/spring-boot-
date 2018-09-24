package com.zzq.springboot02config.config;

import com.zzq.springboot02config.service.HelloService;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZZQ
 * @date 2018/8/28 10:47
 * @Configuration 指明当前类为一个配置类，这个类相当于xml
 * @ConfigurationProperties 这个注解是把配置文件中的配置映射到一个类的个个属性上面
 * @Bean 标注在方法上，给容器中添加组件 ,将方法的返回值添加到容器中,容器中默认的id 就是方法名
 */

@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService(){
        return  new HelloService();
    }

}
