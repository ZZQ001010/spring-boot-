package com.zzq.springboot02config.bean;

/**
 * @author ZZQ
 * @date 2018/8/28 8:40
 */
public class Dog {

    private String name ;
    private Integer age ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
