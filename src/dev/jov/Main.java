package dev.jov;

import dev.jov.model.Books;
import dev.jov.model.Clothing;
import dev.jov.model.Electronics;
import dev.jov.service.ShoppingCart;

public class Main {
  public static void main(String[] args) {

    ShoppingCart cart = new ShoppingCart();

    Electronics laptop = new Electronics("EL001", "Laptop", 25000, 5);
    Clothing tshirt = new Clothing("CL001", "Tričko", 500, 10);
    Books book = new Books("BK001", "Java Programming", 800, 20);

    cart.addProduct(laptop, 1);
    cart.addProduct(tshirt, 2);
    cart.addProduct(book, 6);

    cart.printCart();
    cart.applyDiscounts();
    cart.printCart();

    double total = cart.calculateTotal();
    System.out.println("Celková cena: " + total + " Kč");

  }
}
