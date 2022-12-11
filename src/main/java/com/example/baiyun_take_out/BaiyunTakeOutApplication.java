package com.example.baiyun_take_out;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class BaiyunTakeOutApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaiyunTakeOutApplication.class, args);
        log.info("白云外卖项目启动成功");
    }

}
