package com.zzq.springboot04restfulcrud.controller;

import com.zzq.springboot04restfulcrud.entities.Department;
import com.zzq.springboot04restfulcrud.entities.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;

/**
 * @author ZZQ
 * @date 2018/9/2 17:21
 */
@Controller
public class EmployeeController {

    @GetMapping("/emps")
    public String emps(Map map){
        List<Employee> emps = new ArrayList();
        for(int i = 0  ; i < 10 ; i++){
            Employee employee = new Employee(i, "张三" + i, "2766090785@qq.com" + i, i, new Department(i, "部门" + i));
            emps.add(employee);
        }
        map.put("emps",emps);
        return  "list";
    }


    @GetMapping("/emp")
    public String emp(Map map){
        List<Department> list = new ArrayList<>();
        for(int i = 0  ; i < 10 ; i++){
            Department de = new Department(i, i + "");
            list.add(de);
        }
        map.put("depts",list);
        return  "emp/add" ;
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee){
        System.out.println(employee);
        return  "redirect:/emps" ;
    }

    @DeleteMapping("/emp/{id}")
    public String deleteEmp(@PathVariable("id") String id){
        System.out.println(id);
        return  "redirect:/emps";
    }
}
