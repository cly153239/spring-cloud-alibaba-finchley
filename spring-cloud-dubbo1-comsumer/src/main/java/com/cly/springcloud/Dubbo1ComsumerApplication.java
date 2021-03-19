package com.cly.springcloud;

import com.cly.springcloud.service.HelloTestService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@RestController
//@DubboComponentScan
@EnableDubbo
public class Dubbo1ComsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Dubbo1ComsumerApplication.class, args);
    }
    @Reference
    private HelloTestService helloTestService;
    @RequestMapping(value = "/helloTest")
    public String hello(@RequestParam(name="name",required = false)String name) {
       return helloTestService.helloTest(name);
    }
}
