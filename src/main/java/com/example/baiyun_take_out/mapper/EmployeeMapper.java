package com.example.baiyun_take_out.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.baiyun_take_out.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Administrator
* @description 针对表【employee(员工信息)】的数据库操作Mapper
* @createDate 2022-11-29 23:19:43
* @Entity com.example.baiyun_take_out.domain.Employee
*/
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {


}
