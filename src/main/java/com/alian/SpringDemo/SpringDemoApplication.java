package com.alian.SpringDemo;

import com.alian.SpringDemo.controller.InjectViaConstructor;
import com.alian.SpringDemo.controller.InjectViaSetter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context =
                SpringApplication.run(SpringDemoApplication.class, args);

        InjectViaConstructor injectViaConstructor = (InjectViaConstructor) context.getBean("injectViaConstructor");
        injectViaConstructor.getMessage();

        InjectViaSetter injectViaSetter = (InjectViaSetter) context.getBean("injectViaSetter");
        injectViaSetter.getMessage();
    }

}
