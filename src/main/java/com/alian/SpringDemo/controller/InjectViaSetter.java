package com.alian.SpringDemo.controller;

import com.alian.SpringDemo.service.HelloSpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class InjectViaSetter {

    private HelloSpringService service;

    //    untuk injection harus pake @Autowired
    @Autowired
    public void setService(HelloSpringService service) {
        this.service = service;
    }

    public void getMessage() {
        service.sayHelloSetter();
    }
}
