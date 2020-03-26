package com.springboot.tutorial.todo.todos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

    @RequestMapping("/")
    public String greeting(){

      return "welcome ";
    }

    @GetMapping("/{name}")
    public String greeting(@PathVariable String name){
       
        return name;

    }
    
}