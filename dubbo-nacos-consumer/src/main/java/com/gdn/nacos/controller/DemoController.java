package com.gdn.nacos.controller;

import com.gdn.nacos.service.NacosConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author taoroot
 * @Date 2019/5/31 13:34
 */
@RestController
public class DemoController {

    @Autowired
    private NacosConsumerService nacosConsumerService;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return nacosConsumerService.sayHello(name);
    }
}
