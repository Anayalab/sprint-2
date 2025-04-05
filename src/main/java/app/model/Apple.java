package app.model;

import app.model.constants.Colour;
import app.model.constants.Discount;

public class Apple extends Food implements Discountable {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super.amount = amount;
        super.price = price;
        super.isVegetarian = true;
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (colour == Colour.RED) {
            return Discount.DISCOUNT;
        } else {
            return Discount.NO_DISCOUNT;
        }
    }

}
