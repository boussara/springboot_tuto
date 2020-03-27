package com.springboot.tutorial.todo.todos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Todos")
public class Todo {

    @Id
    private String id;
    private String title;
    private String description;
    private long timesstamp;


    public Todo() {
this.timesstamp=System.currentTimeMillis();

    }

    public Todo(String id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    
    

    /**
     * @return int return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    

    /**
     * @return long return the timesstamp
     */
    public long getTimesstamp() {
        return timesstamp;
    }

    /**
     * @param timesstamp the timesstamp to set
     */
    public void setTimesstamp(long timesstamp) {
        this.timesstamp = timesstamp;
    }

}
