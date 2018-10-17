package com.silverhyuk.spring_thread_pool.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/hello")
    public HelloVo hello(@RequestParam(value="name", defaultValue="World") String name) {

        logger.info("Hello {}", name);
        helloService.method1();
        helloService.method2();

        return new HelloVo(counter.incrementAndGet(),  String.format(template, name));
    }
}
