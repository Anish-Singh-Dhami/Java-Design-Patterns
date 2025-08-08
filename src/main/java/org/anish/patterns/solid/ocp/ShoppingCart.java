package org.anish.patterns.solid.ocp;

import java.util.ArrayList;

public class ShoppingCart {
    private final ArrayList<Product> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addProductToTheCart(Product product) {
        cartItems.add(product);
    }

    public ArrayList<Product> getCartItems() {
        return cartItems;
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for(Product product: cartItems) {
            total += product.getProductPrice();
        }
        return total;
    }
}
