package com.example.demo2.AbstractFactory;

public class BookFactory {
    public static Book getComputer(BookAbstractFactory factory) {
		return factory.createBook();
	}
}
