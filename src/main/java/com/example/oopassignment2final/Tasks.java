package com.example.oopassignment2final;

public class Tasks {

    private String title;
    private String description;
    private int priority;

    /**
     * A public constructor that takes following arguments.
     * @param title
     * @param description
     * @param priority
     */
    public Tasks(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    /**
     * getter method for title
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * setter method for title
     * setter validated with regex
     * @param title
     */
    public void setTitle(String title) {
        if(title.matches("[A-Z a-z 0-9]+1")){
            this.title = title;
        }else{
            throw new IllegalArgumentException("Please Enter Valid alphabetical Input for Title");
        }

    }

    /**
     * getter method for description
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * setter method for description
     * @param description
     */
    public void setDescription(String description) {
        if(description.length()>0){
            this.description = description;
        }else {
            throw new IllegalArgumentException("Please Enter a Task");
        }
    }

    /**
     * getter method for priority
     * @return
     */
    public int getPriority() {
        return priority;
    }

    /**
     * setter method for priority
     * setter validated: Priority can never be negative
     * @param priority
     */
    public void setPriority(int priority) {
        if(priority>0){
            this.priority = priority;
        }else throw new IllegalArgumentException("Priority can never be negative");

    }
}
