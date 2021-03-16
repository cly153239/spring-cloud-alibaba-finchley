package com.cly.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class DubboServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboServerApplication.class, args);
    }

    @RequestMapping(value = "/hello")
    public String hello() {
       return "nacos balance";
    }
}
