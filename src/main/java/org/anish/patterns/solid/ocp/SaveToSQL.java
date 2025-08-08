package org.anish.patterns.solid.ocp;

import org.anish.patterns.solid.srp.ShoppingCart;

public class SaveToSQL implements IDBPersistence {
    ShoppingCart cart;
    public SaveToSQL(ShoppingCart cart) {
        this.cart = cart;
    }
    @Override
    public void saveToDB() {
        System.out.println("Saving Cart Data in SQL...");
    }
}
