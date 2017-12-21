package com.colin.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Colin on 2017/12/20.
 */
@SpringBootApplication
@RestController
public class BootApplication {

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello Boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class,args);
    }
}
