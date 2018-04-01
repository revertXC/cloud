package com.deer.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("deer")
public interface TestService {
    @GetMapping(value = "/add")
    String add(@RequestParam("a") Integer a,@RequestParam("b") Integer b);
}
