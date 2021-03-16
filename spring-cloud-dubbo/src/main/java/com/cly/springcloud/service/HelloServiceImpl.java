package com.cly.springcloud.service;

import org.apache.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl  implements HelloService{
    @Override
    public String hello(String name) {
        return "hello dubbo"+name;
    }
}
