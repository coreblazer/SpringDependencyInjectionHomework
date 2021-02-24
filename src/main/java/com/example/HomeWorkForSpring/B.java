package com.example.HomeWorkForSpring;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class B {

    @Autowired
    private final C c;
}
