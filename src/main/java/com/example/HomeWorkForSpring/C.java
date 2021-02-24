package com.example.HomeWorkForSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class C {
    @Autowired
    private final D d;

    @Autowired
    private final S s1;

    public C(ApplicationContext context, S s1) {
        this.d = context.getBean(D.class);;
        this.s1 = s1;
    }

    @PostConstruct
    public void init() {
        System.out.println("Got the D: " + d.getValue());
    }

}
