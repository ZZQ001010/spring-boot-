package com.zzq.springboot04restfulcrud.entities;

import lombok.*;
import lombok.experimental.Accessors;

import javax.validation.constraints.AssertTrue;

@Getter
@Setter
public class Dept {
    private String name ;
    private Integer age ;

    public static void main(String[] args) {
        Dept dept = new Dept();

    }

}
