package com.springboot.tutorial.todo.todos.Todoservices;

import java.util.*;



import com.springboot.tutorial.todo.todos.Todo;
import com.springboot.tutorial.todo.todos.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Todoservice {

    @Autowired
    private TodoRepository todoRepository;

    /*
    private List<Todo> data = new ArrayList<>(
        Arrays.asList(
            new Todo(1,"Title","descr1"),
            new Todo(2,"Title","descr1"))
        );
        */

    public List<Todo> findAll(){

        return todoRepository.findAll();
        //return data;
    }

    
    public Todo GetById(String id){

        return todoRepository.findById(id).get();
        /*
        for(Todo todo:data){
          
            if(todo.getId()==id) return todo;


        }
        return null;
        */
    }

    public Todo save(Todo todo){

        return todoRepository.insert(todo);

       // return data.add(todo);

    }
    
    public void delete(String id){
        
        todoRepository.deleteById(id);

        /*
        for(Todo todo:data){
          
            if(todo.getId()==id){
            data.remove(todo);  }
        }
        */

    }

    
    
}