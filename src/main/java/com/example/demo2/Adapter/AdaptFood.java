package com.example.demo2.Adapter;

public class AdaptFood {
    private double price;

    public AdaptFood(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Price= " + this.getPrice();
    }
}
