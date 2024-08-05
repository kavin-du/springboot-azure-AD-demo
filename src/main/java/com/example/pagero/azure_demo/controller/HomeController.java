package com.example.pagero.azure_demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping( "home" )
    public String home( @AuthenticationPrincipal(expression = "claims['name']") String name ) {
        return String.format( "Hello %s!  welcome to the demo app", name);
    }
}
