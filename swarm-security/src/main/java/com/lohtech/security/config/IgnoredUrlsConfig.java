package com.lohtech.security.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;



@ConfigurationProperties(prefix = "secure.ignored")
public class IgnoredUrlsConfig {
    List<String> urls = new ArrayList<>();

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public List<String> getUrls() {
        return urls;
    }
}
