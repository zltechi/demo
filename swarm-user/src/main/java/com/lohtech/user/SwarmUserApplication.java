package com.lohtech.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;


// 扫描 mybatis 包里的接口
//@EnableSwagger2
@SpringBootApplication
public class SwarmUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwarmUserApplication.class, args);
    }

}
