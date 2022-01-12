package com.example.demo2.Factory;

import org.springframework.stereotype.Component;

@Component
public abstract class FactBook {
    public abstract long getId();
    public abstract String getName();
    public abstract String getType();

    @Override
    public String toString() {
        return "Id= " + this.getId() + ", Name= " + this.getName() + ", Type= " + this.getType();
    }
}
