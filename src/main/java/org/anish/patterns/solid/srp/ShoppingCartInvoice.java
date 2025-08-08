package org.anish.patterns.solid.srp;

// Only responsible for printing invoices
public class ShoppingCartInvoice {
    private final ShoppingCart cart;
    public ShoppingCartInvoice(ShoppingCart cart) {
        this.cart = cart;
    }
    public void printInvoice() {
        for(Product product: cart.getCartItems()) {
            System.out.println(product.getProductName() + " = $" + product.getProductPrice());
        }
        System.out.println("Total Price : $"+cart.calculateTotalPrice());
    }
}
