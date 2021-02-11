package com.principal.security.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/")
    public String getDesign(){
        return "<a href=\"https://drive.google.com/file/d/1SuAYzGHBt3E1A19fEY7gCgrYMVdCCGWA/view?usp=sharing\">" +
                "Obtenga el diseño</a>\n";
    }
}
