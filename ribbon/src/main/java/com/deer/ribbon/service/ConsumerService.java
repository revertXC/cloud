package com.deer.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

    @Autowired
    private RestTemplate restTemplate;

    //断路由回调异常函数 addError
    @HystrixCommand(fallbackMethod = "addError")
    public String add(Integer a, Integer b){
        return restTemplate.getForEntity("http://deer/add?a="+a+"&b="+b, String.class).getBody();
    }

    public String addError(Integer a, Integer b){
        return "Error 但还是计算结果为："+(a+b);
    }


}
