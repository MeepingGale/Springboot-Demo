package com.example.demo2.Adapter;

public class AdaptBookObjAdapterImpl implements AdaptBookAdapter {

    private AdaptBook adaptBook = new AdaptBook();

    @Override
    public AdaptFood getOriginalPrice() {
        return adaptBook.getPrice();
    }

    @Override
    public AdaptFood getDiscountedPrice() {
        AdaptFood adaptFood = adaptBook.getPrice();
        return calculatePrice(adaptFood, 0.85);
    }

    @Override
    public AdaptFood getInfatedPrice() {
        AdaptFood adaptFood = adaptBook.getPrice();
        return calculatePrice(adaptFood, 1.45);
    }
    
    private AdaptFood calculatePrice(AdaptFood adaptFood, double val) {
        return new AdaptFood(adaptFood.getPrice() * val);
    }
}
