package com.alian.SpringDemo.implement;

import com.alian.SpringDemo.service.HelloSpringService;
import org.springframework.stereotype.Component;

@Component
public class HelloSpringImpl implements HelloSpringService {
    @Override
    public void sayHello() {
        System.out.println("Injection menggunakan controller");
    }

    @Override
    public void sayHelloSetter() {
        System.out.println("Injection Menggunakan method setter");
    }
}
