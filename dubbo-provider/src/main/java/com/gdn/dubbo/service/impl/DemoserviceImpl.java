package com.gdn.dubbo.service.impl;

import com.gdn.service.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author taoroot
 * @Date 2019/5/30 16:36
 */
@Service
@Component
public class DemoserviceImpl implements DemoService {
    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${spring.application.name}")
    private String serviceName;

    public String helloWorld(String name) {
        return String.format("[%s] : Hello,this is dubbo2.7.1 %s", serviceName, name);
    }
}
