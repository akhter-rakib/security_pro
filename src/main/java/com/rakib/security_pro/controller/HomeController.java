package com.rakib.security_pro.controller;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String greeting() {
        return "<center><h1>Hello Bangladesh</h1></center>";
    }

    @GetMapping("/user")
    public String user() {
        return "<center><h1>Welcome User</h1></center>";
    }

    @GetMapping("/admin")
    public String admin() {
        return "<center><h1>Welcome admin</h1></center>";
    }
}
