package com.example.baiyun_take_out.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 全局异常处理
 */
@ControllerAdvice(annotations = {RestController.class, Controller.class})//加了这两个注解都会被处理器进行处理
@ResponseBody//结果封装成json数据来返回
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 异常处理方法
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ResultType<String> exceptionHandler(Exception ex){
        log.error(ex.getMessage());

        if(ex.getMessage().contains("employee.idx_username")){
            return ResultType.error("该用户已存在");
        }

        if(ex.getMessage().contains("category.idx_category_name")){
            return ResultType.error("该菜品 or 套餐已存在");
        }

        if(ex.getMessage().contains("Failed to convert value of type")){
            return ResultType.error("暂未开放");
        }
        return ResultType.error("未知错误");
    }


}
