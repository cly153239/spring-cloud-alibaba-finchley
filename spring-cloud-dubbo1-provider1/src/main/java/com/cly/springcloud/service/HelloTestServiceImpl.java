package com.cly.springcloud.service;

import org.apache.dubbo.config.annotation.Service;

//@Service(cluster = "failover",loadbalance = "roundrobin")
@Service(loadbalance = "random")
public class HelloTestServiceImpl implements HelloTestService {
    @Override
    public String helloTest(String name) {
        return "helloTest12344444>>>>>>>>>"+name;
    }
}
