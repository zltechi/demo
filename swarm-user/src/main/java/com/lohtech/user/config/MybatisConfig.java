package com.lohtech.user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@EnableTransactionManagement
@MapperScan({"com.lohtech.model.user.dao"})
public class MybatisConfig {
}
