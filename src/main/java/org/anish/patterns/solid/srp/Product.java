package org.anish.patterns.solid.srp;

public class Product {
    private String name;
    private int price;
    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    void setProductName(String name) {
        this.name = name;
    }
    void setProductPrice(int price) {
        this.price = price;
    }
    String getProductName() {
        return name;
    }
    int getProductPrice() {
        return price;
    }
}
