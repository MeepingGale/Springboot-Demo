package com.example.demo2.AbstractFactory;

public class AbstFactStorybookFactory implements AbstFactBookAbstractFactory {

    private long id;
    private String name;
    private String type;

    public AbstFactStorybookFactory(long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    @Override
    public AbstFactBook createBook() {
        return new AbstFactStorybook(id, name, type);
    }
    
}
