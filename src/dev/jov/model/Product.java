package dev.jov.model;

public abstract class Product {


  protected  String productId;
  protected String name;
  protected double price;
  protected int stockQuantity;

  //Konstruktor
  public Product() {
  }

  public Product(String productId, String name, double price, int stockQuantity) {
    this.productId = productId;
    this.name = name;
    this.price = price;
    this.stockQuantity = stockQuantity;
  }


  //Abstract metody
  public abstract String getCategory();
  public abstract double calculateShipping();


  //Metody
  public boolean isInStock(){
    if (stockQuantity > 0){
      return true;
    } else {
      System.out.println("Produkt neni skladem");
      return false;
    }
  }

  //Getters
  public int getStockQuantity() {
    return stockQuantity;
  }

  public double getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  public String getProductId() {
    return productId;
  }


}
