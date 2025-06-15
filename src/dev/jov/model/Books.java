package dev.jov.model;
import dev.jov.interfaces.Discountable;

public class Books extends Product implements Discountable{

  public Books(String productId, String name, double price, int stockQuantity) {
    super(productId, name, price, stockQuantity);
  }

  //Metody z Discountable
  @Override
  public double calculateDiscount(int quantity) {
    if (quantity >=5){
      double discount = 0.1;
      double priceAfterDiscount = price - (discount*price);
      return priceAfterDiscount;
    }
    return 0;
  }

  @Override
  public void applySeasonDiscount() {
    double discount = 0.15;
    this.price = price - (price*discount);
  }

  //Metody z Product
  @Override
  public String getCategory() {
    return "Books";
  }

  @Override
  public double calculateShipping() {
    return 50.00;
  }
}
