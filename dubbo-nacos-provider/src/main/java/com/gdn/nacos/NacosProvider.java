package com.gdn.nacos;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class NacosProvider {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvider.class, args);
    }
}
