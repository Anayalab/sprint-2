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
                total += products[i].getPrice() * products[i].getAmount();
            }
        return total;
        }

    public double getTotalAmountOfProductsWithDiscount() { // получить общую сумму товаров в корзине со скидкой (с примененной скидкой!)
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getDiscount() == Discount.DISCOUNT) {
                double multiplier = (100 - Discount.DISCOUNT) / 100.0;
                total += products[i].getPrice() * products[i].getAmount() * multiplier; // цена * количество (кг)
            } else {
                total += products[i].getPrice() * products[i].getAmount(); // учитываем товары без скидки
            }
        }
        return total;
    }

    public double getVegProductsAmount() { // получить общую сумму всех вегетарианских продуктов в корзине без скидки.
        double total = 0;
        for (int i = 0; i < products.length; i++) {
                if (products[i].isVegetarian()) {
                    total += products[i].getPrice() * products[i].getAmount();
                }
            }
        return total;
        }
    }
