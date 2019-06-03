package com.gdn.consumer.controller;

import com.gdn.consumer.service.DemoConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author taoroot
 * @Date 2019/5/29 18:09
 */

@RestController
public class DemoTestController {

    @Autowired
    private DemoConsumerService consumerService;

    @GetMapping("/hello/{name}")
    public String Hello(@PathVariable String name) {
        return consumerService.helloWorld(name);
    }

}
