package dev.jov.model;
import dev.jov.interfaces.Discountable;


public class Electronics extends Product implements Discountable{

  public Electronics(String productId, String name, double price, int stockQuantity) {
    super(productId, name, price, stockQuantity);
  }

  //Metody z Discountable
  @Override
  public double calculateDiscount(int quantity) {
    if (quantity >=3){
      double discount = 0.05;
      double priceAfterDiscount = price - (discount*price);
      return priceAfterDiscount;
    }
    return 0;
  }

  @Override
  public void applySeasonDiscount() {
    double discount = 0.1;
    this.price = price - (price*discount);
  }

  //Metody z Product
  @Override
  public String getCategory() {
    return "Electronics";
  }

  @Override
  public double calculateShipping() {
    return 150.00;
  }
}
