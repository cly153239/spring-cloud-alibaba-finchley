package com.cly.springcloud.service;

import org.apache.dubbo.config.annotation.Service;


@Service(loadbalance = "random",cluster = "failover")
public class HelloTestServiceImpl implements HelloTestService {
    @Override
    public String helloTest(String name) {
        int i=1/0;
        return "helloTest>>>>>>>>>"+name;
    }
}
