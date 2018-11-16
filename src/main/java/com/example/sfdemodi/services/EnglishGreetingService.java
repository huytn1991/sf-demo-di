package com.example.sfdemodi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EnglishGreetingService implements GreetingService {

    @Override
    public String saidHello() {
        return "Hello. Nice to meet you";
    }
}
