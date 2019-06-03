package com.gdn.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gdn.service.DemoService;
import org.springframework.stereotype.Component;

@Component
public class DemoConsumerService{

    @Reference
    DemoService demoService;

    public String helloWorld(String name) {
        return demoService.helloWorld(name);
    }
}