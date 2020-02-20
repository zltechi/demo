package com.lohtech.user.config;

import com.lohtech.security.config.IgnoredUrlsConfig;
import com.lohtech.security.config.SecurityConfig;
import com.lohtech.user.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity
@EnableConfigurationProperties({IgnoredUrlsConfig.class})
public class UserSecurityConfig extends SecurityConfig {

//    @Autowired
//    private UmsAdminService umsAdminService;


}
