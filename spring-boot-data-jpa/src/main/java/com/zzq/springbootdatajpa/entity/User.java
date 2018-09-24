package com.zzq.springbootdatajpa.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author ZZQ
 * @date 2018/9/4 19:01
 */
//告诉数据表对应的一个实体类
@Entity
@Table(name = "tbl_user") //指定和那个数据表对应
@Getter
@Setter
@ToString
public class User  {

    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private  Integer id ;

    @Column(name = "last_name",length = 50)
    private String username ;

    @Column  //默认名字
    private String email ;


}
