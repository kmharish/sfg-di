package com.test.sfgdi.controllers;

import com.test.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class PropertyInjectedController {
    @Autowired
    private GreetingService greetingService;

    public String getGreeting(){
       return greetingService.sayGreeting();
    }
}


