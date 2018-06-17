package com.backpackers.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

    @GetMapping("/hello")
    public String hello(){
        return "helloSpringboot";
    };


    @GetMapping("/error")
    public String error(){
        return "No";
    };
}
