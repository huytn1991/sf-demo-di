package com.example.sfdemodi.services;

import org.springframework.stereotype.Service;

@Service
public class MalayGreetingService implements GreetingService {

    @Override
    public String saidHello() {
        return "Halo, senang bertemu dengan Anda";
    }
}
