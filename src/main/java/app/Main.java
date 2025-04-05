package app;

import app.model.Apple;
import app.model.Food;
import app.model.Meat;
import app.model.constants.Colour;
import app.model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        Food[] productList = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(productList);
        System.out.println(shoppingCart.getTotalAmountOfProducts());
        System.out.println(shoppingCart.getTotalAmountOfProductsWithDiscount());
        System.out.println(shoppingCart.getVegProductsAmount());
    }

}
