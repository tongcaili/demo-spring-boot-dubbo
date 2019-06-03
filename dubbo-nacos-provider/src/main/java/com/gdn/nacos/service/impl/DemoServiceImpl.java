package com.gdn.nacos.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gdn.service.DemoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author taoroot
 * @Date 2019/5/31 11:50
 */
@Service
@Component
public class DemoServiceImpl implements DemoService {
    @Value("${spring.application.name}")
    private String serviceName;

    public String helloWorld(String name) {
        return String.format("[%s] : Hello,this is nacos %s", serviceName, name);
    }
}
