package app.model.service;

import app.model.Food;
import app.model.constants.Discount;
// Корзина

public class ShoppingCart {
    private Food[] products; // массив продуктов в корзине

    public ShoppingCart(Food[] products) { // конструктор с параметром - массив элементов Food
        this.products = products;
    }

    public double getTotalAmountOfProducts() { // получить общую сумму товаров в корзине без скидки
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getDiscount() == Discount.NO_DISCOUNT) {
                total += products[i].getPrice();
            }
        }
        return total;
    }

    public double getTotalAmountOfProductsWithDiscount() { // получить общую сумму товаров в корзине со скидкой (с примененной скидкой!)
        double total = 0;
        double multiplier = ((100 - Discount.DISCOUNT) / 100); // 0,4
        for (int i = 0; i < products.length; i++) {
            if (products[i].getDiscount() == Discount.DISCOUNT) {
                total += products[i].getPrice();
            }
        }
        return total * multiplier; // total - 60%
    }

    public double getVegProductsAmount() { // получить общую сумму всех вегетарианских продуктов в корзине без скидки.
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getDiscount() == Discount.NO_DISCOUNT) {
                if (products[i].isVegetarian() == true) {
                    total += products[i].getPrice();
                }
            }
        }
        return total;
    }

}