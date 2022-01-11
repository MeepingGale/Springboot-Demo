package com.example.demo2.AbstractFactory;

public class AbstFactBookFactory {
    public static AbstFactBook getComputer(AbstFactBookAbstractFactory factory) {
		return factory.createBook();
	}
}
