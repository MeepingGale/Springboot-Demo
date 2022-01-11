package com.example.demo2.AbstractFactory;

public class TextbookFactory implements BookAbstractFactory {
    private long id;
    private String name;
    private String type;

    public TextbookFactory(long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    @Override
    public Book createBook() {
        return new Textbook(id, name, type);
    }
}
