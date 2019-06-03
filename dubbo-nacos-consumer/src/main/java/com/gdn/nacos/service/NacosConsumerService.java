package com.gdn.nacos.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.gdn.service.DemoService;
import org.springframework.stereotype.Component;

/**
 * @Author taoroot
 * @Date 2019/5/31 13:33
 */
@Component
public class NacosConsumerService {

    @Reference
    DemoService demoService;

    public String sayHello(String name) {
        return demoService.helloWorld(name);
    }
}
