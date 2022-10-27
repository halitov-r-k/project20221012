package ru.halitov.MVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloMVC {
@GetMapping("/")
    public String sayHelloMVC(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "volume", required = false) Integer volume,
                              Model model) {
   // System.out.println("name: " + name + " volume: " + volume);
    model.addAttribute("message", "name: " + name + " volume: " + volume);
    return "helloMVC";}
}
