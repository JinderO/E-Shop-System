package dev.jov.service;

import dev.jov.interfaces.Discountable;
import dev.jov.model.Product;

import java.util.ArrayList;

public class ShoppingCart {
  
  private ArrayList<Product> products = new ArrayList();
  private ArrayList<Integer> quantities = new ArrayList();
  
  //Metody
  public void addProduct(Product product, int quantity){
    products.add(product);
    quantities.add(quantity);
    System.out.println( quantity + " ks produktu " + product.getName() + " vloženo do košíku");
  }
  
  public void removeProduct(String productId){
    for (int i =0; i < products.size();i++){
      if (products.get(i).getProductId().equals(productId)){
        products.remove(i);
        quantities.remove(i);
        System.out.println("Produkt odstraněn z košíku");
        return;
      }
    }
    System.out.println("Produkt nenalezen");
  }

  public double calculateTotal(){
    double total= 0;
    for(int i =0;i < products.size(); i++){
      Product product = products.get(i);
      int quantity = quantities.get(i);
      total += (product.getPrice() * quantity) + product.calculateShipping();
    }
    return total;
  }

  public void applyDiscounts() {
    for (int i = 0; i < products.size(); i++) {
      Product product = products.get(i);
      int quantity = quantities.get(i);

      if (product instanceof Discountable) {
        Discountable discountableProduct = (Discountable) product;

        // 1. Aplikuj množstevní slevu
        double discountedPrice = discountableProduct.calculateDiscount(quantity);
        if (discountedPrice > 0) {
          // Nastav novou cenu jen pokud je sleva
          // (tohle je trochu komplikované, protože price je v Product)
        }

        // 2. Aplikuj sezónní slevu
        discountableProduct.applySeasonDiscount();
      }
    }
  }

    public void printCart(){
      System.out.println("===Nákupní košík===");
    for (int i = 0; i < products.size(); i++){
      Product product = products.get(i);
      int quantity = quantities.get(i);
      System.out.println(product.getName() + " (" + product.getCategory() + ") - " + quantity + "x " + product.getPrice() + " Kč");
    }
  }
  
  
}
