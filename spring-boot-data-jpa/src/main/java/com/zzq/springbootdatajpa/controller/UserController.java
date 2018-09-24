package com.zzq.springbootdatajpa.controller;

import com.zzq.springbootdatajpa.entity.User;
import com.zzq.springbootdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author ZZQ
 * @date 2018/9/4 19:35
 */
@RestController
public class UserController  {


    @Autowired
    UserRepository userRepository  ;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        Optional<User> user = userRepository.findById(id);

        return  user.get() ;
    }

    @GetMapping("/user")
    public User insertUser(User user){
        userRepository.save(user);
        return  user ;
    }


}
