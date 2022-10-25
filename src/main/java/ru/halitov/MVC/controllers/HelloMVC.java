package ru.halitov.MVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloMVC {
@GetMapping("/")
    public String sayHelloMVC() {return "helloMVC";}
}
