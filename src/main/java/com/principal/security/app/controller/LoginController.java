package com.principal.security.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class LoginController {

    @GetMapping("/")
    public List<String> getDesign(){

        return Arrays.asList("<a href=\"https://docs.google.com/document/d/12JMt8CfmwFm3qIppvYU3amCBomhIVWlK6NRTYNhfBwE/edit?usp=sharing\">" +
                "Obtenga el diseño</a>\n", "");
    }

    @GetMapping("/thanks")
    public String getThanks(){
        return "Thanks for register";
    }
}
