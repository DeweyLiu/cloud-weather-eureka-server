package com.deweyliu.spring.cloud.weather.modules.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DeweyLiu
 * @version 1.0.0
 * @date 2018/12/11 17:16
 */
@RestController
public class HelloWorld {
    @GetMapping("/hello")
    public String helloWorld() {
        return "hello world";
    }
}
