package com.example.demo2.AbstractFactory;

public class AbstFactTextbookFactory implements AbstFactBookAbstractFactory {
    private long id;
    private String name;
    private String type;

    public AbstFactTextbookFactory(long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    @Override
    public AbstFactBook createBook() {
        return new AbstFactTextbook(id, name, type);
    }
}
