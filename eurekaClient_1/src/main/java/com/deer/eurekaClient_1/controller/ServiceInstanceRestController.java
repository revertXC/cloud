package com.deer.eurekaClient_1.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class ServiceInstanceRestController {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ServiceInstanceRestController.class);
//    @Autowired
//    private DiscoveryClient discoveryClient; //服务发现客户端

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        Integer r = a + b;
        System.out.println("端口："+port+"  Vlaue:"+r);
        return r;
    }

}
