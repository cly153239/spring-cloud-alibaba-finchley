package com.cly.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class NacosServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosServerApplication.class, args);
    }
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @RequestMapping(value = "/hello")
    public String hello() {
       return "nacos balance";
    }
}
