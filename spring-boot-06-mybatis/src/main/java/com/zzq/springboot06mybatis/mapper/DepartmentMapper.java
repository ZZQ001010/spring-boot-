package com.zzq.springboot06mybatis.mapper;

import com.zzq.springboot06mybatis.entity.Department;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * @author ZZQ
 * @date 2018/9/4 16:47
 */
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id );

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert  into department(departmentName) values(#{departmentName})")
    public int insertDept( Department department);


}
