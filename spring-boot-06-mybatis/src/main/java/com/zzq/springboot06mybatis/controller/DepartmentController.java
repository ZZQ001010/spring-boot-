package com.zzq.springboot06mybatis.controller;

import com.zzq.springboot06mybatis.entity.Department;
import com.zzq.springboot06mybatis.entity.Employee;
import com.zzq.springboot06mybatis.mapper.DepartmentMapper;
import com.zzq.springboot06mybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZZQ
 * @date 2018/9/4 17:05
 */
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentMapper departmentMapper ;

    @Autowired
    private EmployeeMapper  employeeMapper ;


    @GetMapping("/dept/{id}")
    public Department getDepartById(@PathVariable("id") Integer id){
        return  departmentMapper.getDeptById(id);
    }

    @GetMapping("/insertdept")
    public Department insertDepartment(Department department){
        departmentMapper.insertDept(department);
        return  department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmployeeById(@PathVariable("id") Integer id){
        return  employeeMapper.getEmployeeById(id);
    }

    @GetMapping("/emp")
    public Employee insertEmployee(Employee employee){
        employeeMapper.insertEmploy(employee);
        return  employee ;
    }


}
