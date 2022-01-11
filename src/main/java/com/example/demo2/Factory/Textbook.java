package com.example.demo2.Factory;

public class Textbook extends Book {

    private long id;
    private String name;
    private String type;

    public Textbook(long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }
    
}
