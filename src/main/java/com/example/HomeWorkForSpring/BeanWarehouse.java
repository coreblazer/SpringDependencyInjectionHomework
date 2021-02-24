package com.example.HomeWorkForSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class BeanWarehouse {

    @Bean
    public S s1() {
        return new S("s1");
    }

    @Bean
    public E e1() {
        return new E("e1");
    }

    @Profile("d1")
    @Bean
    public D d1() {
        return new D1("d1");
    }


    @Profile("d2")
    @Bean
    public D d2() {
        return new D1("d2");
    }
}
