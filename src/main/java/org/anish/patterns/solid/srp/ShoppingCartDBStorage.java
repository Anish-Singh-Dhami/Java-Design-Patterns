package org.anish.patterns.solid.srp;

// Responsible for saving cart information to DB
public class ShoppingCartDBStorage {
    private final ShoppingCart cart;
    public ShoppingCartDBStorage(ShoppingCart cart) {
        this.cart = cart;
    }
    public void saveToDB() {
        System.out.println("Saving Cart to DB...");
    }
}
