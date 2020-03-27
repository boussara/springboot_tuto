package com.springboot.tutorial.todo.todos.controller;


import java.util.*;

import com.springboot.tutorial.todo.todos.Todo;
import com.springboot.tutorial.todo.todos.Todoservices.Todoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1/todos")
public class todocontroller {

    @Autowired
    private Todoservice  todoservice;

    @GetMapping(value = {"","/"})
    public List<Todo> listtodos()
    {
         return todoservice.findAll();
    }

    @GetMapping("/{id}")
    public Todo GetById(@PathVariable String id)
    {
         return todoservice.GetById(id);
    }

    @PostMapping(value = {"","/"})
    public Todo createnewtodo(@RequestBody Todo todo){

     return todoservice.save(todo);

    }

    @DeleteMapping("/{id}")
    public void deletnewtodo(@PathVariable String id){

     todoservice.delete( id);

     }


     }
}


