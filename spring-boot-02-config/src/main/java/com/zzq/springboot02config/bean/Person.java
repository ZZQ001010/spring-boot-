package com.zzq.springboot02config.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author ZZQ
 * @date 2018/8/28 8:38
 * 将配置文件中配置的每一个值，映射到组件中
 * @ConfigurationProperties
 * 告诉springboot 把本类中的所有属性和配置文件中的属性进行绑定
 *      prefix = "person" 告诉配置文件中那个属性进行一一对应
 *      只有这个组件是容器中的组件才能使用提供的@ConfigurationProperties  功能
 *  @ConfigurationProperties  默认加载全局配置文件  只能记载properties 配置文件不能加载yml
 */
//这里可以支持数组， 就是可以同时加载多个!全局配置文件

//@PropertySource(value = {"classpath:person.properties"})
//@Component    //容器中注册组件
//@ConfigurationProperties(prefix = "person")
public class Person {

    private String lastName ;
    private Integer age ;
    private Boolean boss ;
    private Date birth ;

    private Map<String,Object> maps ;
    private List<Object> lists ;

    private Dog dog ;


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }


    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
