package com.lohtech.user;

import com.lohtech.security.config.IgnoredUrlsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
public class SwarmUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwarmUserApplication.class, args);
    }

}
