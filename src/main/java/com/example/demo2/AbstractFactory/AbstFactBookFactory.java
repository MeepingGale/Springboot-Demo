package com.example.demo2.AbstractFactory;

public class AbstFactBookFactory {
    public static AbstFactBook getBook(AbstFactBookAbstractFactory factory) {
		return factory.createBook();
	}
}
