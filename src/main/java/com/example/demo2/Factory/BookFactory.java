package com.example.demo2.Factory;

public class BookFactory {
    public static Book getComputer(long id, String name, String type){
		if("Textbook".equalsIgnoreCase(type)) return new Textbook(id, name, type);
		else if("Storybook".equalsIgnoreCase(type)) return new Storybook(id, name, type);
		
		return null;
	}
}
