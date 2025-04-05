package app.model;

public abstract class Food implements Discountable {
    protected int amount; // количество продукта в килограммах
    protected double price; //  цена за единицу
    protected boolean isVegetarian; // флаг, который показывает, вегетарианский ли продукт

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}
