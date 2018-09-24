package com.zzq.springboot06mybatis.mapper;

import com.zzq.springboot06mybatis.entity.Employee;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ZZQ
 * @date 2018/9/4 17:51
 */
//配置版本
public interface EmployeeMapper {

    public Employee getEmployeeById(@PathVariable("id") Integer id);

    public  int insertEmploy(Employee employee);

}
