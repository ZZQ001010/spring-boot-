package com.zzq.springbootdatajpa.repository;

import com.zzq.springbootdatajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ZZQ
 * @date 2018/9/4 19:06
 */
//第一个传入的是对象， 第二个是传入的主键的类型

public interface  UserRepository  extends JpaRepository<User,Integer>{



}
