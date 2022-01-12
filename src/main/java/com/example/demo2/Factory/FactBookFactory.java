package com.example.demo2.Factory;

public class FactBookFactory {
    public static FactBook getBook(long id, String name, String type){
		if("Textbook".equalsIgnoreCase(type)) return new FactTextbook(id, name, type);
		else if("Storybook".equalsIgnoreCase(type)) return new FactStorybook(id, name, type);
		
		return null;
	}
}
