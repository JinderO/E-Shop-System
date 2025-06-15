package dev.jov.model;

public class Clothing extends Product{

  public Clothing(String productId, String name, double price, int stockQuantity) {
    super(productId, name, price, stockQuantity);
  }

  //Metody z Product
  @Override
  public String getCategory() {
    return "Clothing";
  }

  @Override
  public double calculateShipping() {
    return 80.00;
  }
}
