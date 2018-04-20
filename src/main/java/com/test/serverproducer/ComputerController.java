package com.test.serverproducer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ComputerController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.GET)
    public Integer add(@PathVariable(value = "a") Integer a, @PathVariable(value = "b") Integer b) {
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
        log.info("/add,host:" + instance.getHost() + " ,service_id= " + instance.getServiceId() + " ,result:" + r);
        return r;
    }

}
