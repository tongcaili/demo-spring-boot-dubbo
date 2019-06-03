package com.gdn.dubbo.controller;

import com.gdn.dubbo.service.DemoConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author taoroot
 * @Date 2019/5/31 09:31
 */
@RestController
public class DemoController {

    @Autowired
    private DemoConsumerService demoConsumerService;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return demoConsumerService.sayHello(name);
    }
}
