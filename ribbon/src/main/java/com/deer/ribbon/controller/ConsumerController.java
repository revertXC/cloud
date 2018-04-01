package com.deer.ribbon.controller;

import com.deer.ribbon.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping(value = "/add")
    public String add() {
        return consumerService.add(10,20);
    }

}
