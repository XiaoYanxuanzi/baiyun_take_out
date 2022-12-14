package com.example.baiyun_take_out.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用返回结果，服务端响应的数据最终都会封装成此对象
 * @param <T>
 */
@Data
public class ResultType<T> {

    private Integer code; //编码：1成功，0和其它数字为失败

    private String msg; //错误信息

    private T data; //数据

    private Map map = new HashMap(); //动态数据

    public static <T> ResultType<T> success(T object) {
        ResultType<T> r = new ResultType<T>();
        r.data = object;
        r.code = 1;
        return r;
    }

    public static <T> ResultType<T> error(String msg) {
        ResultType r = new ResultType();
        r.msg = msg;
        r.code = 0;
        return r;
    }

    public ResultType<T> add(String key, Object value) {
        this.map.put(key, value);
        return this;
    }

}
