package com.springboot.tutorial.todo.todos.Todoservices;

import java.util.*;



import com.springboot.tutorial.todo.todos.Todo;

import org.springframework.stereotype.Service;

@Service
public class Todoservice {

    private List<Todo> data = new ArrayList<>(
        Arrays.asList(
            new Todo(1,"Title","descr1"),
            new Todo(2,"Title","descr1"))
        );

    public List<Todo> findAll(){

        return data;
    }

    
    public Todo GetById(int id){
        for(Todo todo:data){
          
            if(todo.getId()==id) return todo;


        }
       
         return null;



    }

    public boolean save(Todo todo){

        return data.add(todo);

    }
    
    public void delete(int id){

        for(Todo todo:data){
          
            if(todo.getId()==id){
            data.remove(todo);  }


        }

    }

    public void edit (int id , String title ,String description){

        for(Todo todo:data){
          
            if(todo.getId()==id){
           


        }

    }
    
}