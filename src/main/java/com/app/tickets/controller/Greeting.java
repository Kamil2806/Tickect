package com.app.tickets.controller;

import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/greeting/")
public class Greeting {

    @GetMapping("{name}")
    public String greetPerson(@PathVariable(name = "name", required = false) Optional<String> maybeName) {
        String name = maybeName.filter(Strings::isNotBlank).orElse("unknown name");
        return "Hello " + name;
    }
}