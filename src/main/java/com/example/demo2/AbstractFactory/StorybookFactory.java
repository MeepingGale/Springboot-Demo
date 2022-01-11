package com.example.demo2.AbstractFactory;

public class StorybookFactory implements BookAbstractFactory {

    private long id;
    private String name;
    private String type;

    public StorybookFactory(long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    @Override
    public Book createBook() {
        return new Storybook(id, name, type);
    }
    
}
