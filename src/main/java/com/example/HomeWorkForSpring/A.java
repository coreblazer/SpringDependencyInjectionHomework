package com.example.HomeWorkForSpring;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@RequiredArgsConstructor
public class A {
    private final B b1;
    private E e1;

    @Autowired
    private void setE1(E e1) {
        this.e1 = e1;
    }

    @PostConstruct
    public void checking() {
        System.out.println("This is the e var:" + e1.getAddress());
    }
}
