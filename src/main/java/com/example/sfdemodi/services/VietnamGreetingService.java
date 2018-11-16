package com.example.sfdemodi.services;

import org.springframework.stereotype.Service;

@Service
public class VietnamGreetingService implements GreetingService {

    @Override
    public String saidHello() {
        return "Xin chào. Rất vui được gặp bạn.";
    }
}
