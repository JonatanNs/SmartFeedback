package com.SmartFeedback.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/connexion")
    public void showSingIn(){

    }

    @PostMapping("/inscription")
    public void showSingUp(){

    }
}
