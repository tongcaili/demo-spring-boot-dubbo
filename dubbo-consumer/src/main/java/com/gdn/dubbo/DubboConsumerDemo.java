package com.gdn.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author taoroot
 * @Date 2019/5/31 09:33
 */
@SpringBootApplication
public class DubboConsumerDemo {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerDemo.class,args);
    }
}
