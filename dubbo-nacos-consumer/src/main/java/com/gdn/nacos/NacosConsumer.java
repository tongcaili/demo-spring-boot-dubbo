package com.gdn.nacos;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author taoroot
 * @Date 2019/5/31 13:36
 */
@SpringBootApplication
@EnableDubboConfiguration
public class NacosConsumer {
    public static void main(String[] args) {
        SpringApplication.run(NacosConsumer.class, args);
    }
}
