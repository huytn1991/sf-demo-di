package com.example.sfdemodi.controllers;

import com.example.sfdemodi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/setter")
public class SetterInjectController {

    private GreetingService greetService;

    @Autowired
    @Qualifier("vietnamGreetingService")
    public void setGreetingService(GreetingService greetService) {
        this.greetService = greetService;
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String saidHello() {
        return greetService.saidHello();
    }


}
