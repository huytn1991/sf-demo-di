package com.example.sfdemodi.controllers;

import com.example.sfdemodi.services.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/constructor")
public class ConstructorInjectController {

    private GreetingService greetingService;

    public ConstructorInjectController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String saidHello() {
        return greetingService.saidHello();
    }
}
