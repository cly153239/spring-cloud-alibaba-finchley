package com.cly.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableDubbo
public class Dubbo1ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Dubbo1ServerApplication.class, args);
    }
}
