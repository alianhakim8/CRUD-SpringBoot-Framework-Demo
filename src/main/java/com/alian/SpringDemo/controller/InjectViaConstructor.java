package com.alian.SpringDemo.controller;

import com.alian.SpringDemo.service.HelloSpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class InjectViaConstructor {

    // menggunakan method constructor
    private HelloSpringService helloSpringService;

    @Autowired
    public InjectViaConstructor(HelloSpringService helloSpringService) {
        this.helloSpringService = helloSpringService;
    }

    public void getMessage() {
        helloSpringService.sayHello();
    }

}
