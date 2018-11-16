package com.example.sfdemodi.controllers;

import com.example.sfdemodi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/properties")
public class PropertiesInjectController {

    @Autowired
    @Qualifier("malayGreetingService")
    private GreetingService greetingService;

    @RequestMapping("/hello")
    @ResponseBody
    public String saidHello() {
        return greetingService.saidHello();
    }

}
