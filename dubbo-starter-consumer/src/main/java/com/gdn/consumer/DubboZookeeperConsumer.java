package com.gdn.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author taoroot
 * @Date 2019/5/29 13:38
 */

@SpringBootApplication
@EnableDubboConfiguration
public class DubboZookeeperConsumer {
    public static void main(String[] args) {
        SpringApplication.run(DubboZookeeperConsumer.class, args);
    }
}
