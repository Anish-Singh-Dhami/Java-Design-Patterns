package org.anish.patterns.solid.ocp;

import org.anish.patterns.solid.srp.ShoppingCart;

public class SaveToMongoDB implements IDBPersistence{
    ShoppingCart cart;
    public SaveToMongoDB(ShoppingCart cart) {
        this.cart = cart;
    }
    @Override
    public void saveToDB() {
        System.out.println("Saving Cart Data in MongoDB...");
    }
}
