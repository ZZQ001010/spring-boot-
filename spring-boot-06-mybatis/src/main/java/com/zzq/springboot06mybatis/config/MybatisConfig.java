package com.zzq.springboot06mybatis.config;

import ch.qos.logback.classic.gaffer.ConfigurationContributor;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * @author ZZQ
 * @date 2018/9/4 17:18
 */
@Configuration
public class MybatisConfig {

    /**
    *   @author ZZQ
    *   @date 2018/9/4
    *   @description
     *  开启mybatis 驼峰命名法
    */
    public ConfigurationCustomizer configurationCustomizer(){
       return  (configuration)->{
            configuration.setMapUnderscoreToCamelCase(true);
        };
    }
}
