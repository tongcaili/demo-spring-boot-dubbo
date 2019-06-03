package com.gdn.dubbo.service;


import com.gdn.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @Author taoroot
 * @Date 2019/5/31 09:30
 */
@Component
public class DemoConsumerService {

    @Reference
    DemoService demoService;

    public String sayHello(String name) {
        return demoService.helloWorld(name);
    }
}
