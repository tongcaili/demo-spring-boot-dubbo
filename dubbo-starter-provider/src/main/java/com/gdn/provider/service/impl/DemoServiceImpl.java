package com.gdn.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gdn.service.DemoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * @Author taoroot
 * @Date 2019/5/29 13:39
 */
@Service
@Component
public class DemoServiceImpl implements DemoService {

    @Value("${spring.dubbo.application.name}")
    private String serviceName;

    public String helloWorld(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
