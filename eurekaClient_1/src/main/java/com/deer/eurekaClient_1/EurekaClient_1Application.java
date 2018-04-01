package com.deer.eurekaClient_1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient //只适用于 eureka发现服务
@EnableDiscoveryClient //eureka, consul, zookeeper
public class EurekaClient_1Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClient_1Application.class).web(true).run(args);
    }
}
