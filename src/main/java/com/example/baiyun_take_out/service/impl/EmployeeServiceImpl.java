package com.example.baiyun_take_out.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.baiyun_take_out.common.ResultType;
import com.example.baiyun_take_out.entity.Employee;
import com.example.baiyun_take_out.service.EmployeeService;
import com.example.baiyun_take_out.mapper.EmployeeMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

/**
* @author Administrator
* @description 针对表【employee(员工信息)】的数据库操作Service实现
* @createDate 2022-11-29 23:19:43
*/
@Slf4j
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
implements EmployeeService{


    @Resource
    private EmployeeMapper employeeMapper;



}
