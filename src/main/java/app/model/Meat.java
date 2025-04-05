package app.model;

import app.model.constants.Discount;

// Мясо
public class Meat extends Food implements Discountable {

        public Meat(int amount, double price) {
            super.amount = amount;
            super.price = price;
            super.isVegetarian = false;
        }

    @Override
    public double getDiscount() {
        return Discount.NO_DISCOUNT;
    }
}
