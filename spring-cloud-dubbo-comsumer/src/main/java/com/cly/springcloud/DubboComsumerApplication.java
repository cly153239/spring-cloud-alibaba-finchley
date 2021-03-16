package com.cly.springcloud;

import com.cly.springcloud.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
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
public class DubboComsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboComsumerApplication.class, args);
    }
    @Reference
    private HelloService helloService;
    @RequestMapping(value = "/helloTest")
    public String hello(@RequestParam(name="name",required = false)String name) {
       return helloService.hello(name);
    }
}
