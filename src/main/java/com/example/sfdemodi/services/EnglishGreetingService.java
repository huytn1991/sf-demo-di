package com.example.sfdemodi.services;

import org.springframework.stereotype.Service;

@Service
public class EnglishGreetingService implements GreetingService {

    @Override
    public String saidHello() {
        return "Hello. Nice to meet you";
    }
}
