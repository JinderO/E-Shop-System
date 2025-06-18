# 🛒 Java E-Shop System

Advanced e-commerce simulation demonstrating object-oriented programming principles and complex business logic implementation in Java.

## 🚀 Features

- Product Management - Electronics, Books, Clothing with different behaviors
- Shopping Cart System - Add, remove, quantity management
- Dynamic Pricing - Quantity-based and seasonal discounts
- Smart Shipping - Category-based shipping cost calculation
- Discount Interface - Flexible discount system implementation
- Polymorphic Collections - Single cart managing multiple product types

## Demo Output

```
===Nákupní košík===
Laptop (Electronics) - 1x 25000.0 Kč
Tričko (Clothing) - 2x 500.0 Kč
Java Programming (Books) - 6x 800.0 Kč

===Po aplikaci slev===
Laptop (Electronics) - 1x 22500.0 Kč (seasonal 10% discount)
Tričko (Clothing) - 2x 500.0 Kč (no discounts)
Java Programming (Books) - 6x 680.0 Kč (quantity + seasonal discounts)

Poštovné: 280 Kč
Celková cena: 26960 Kč
```

## 🛠️ Technologies Used

- **Java 17+** - Core programming language
- **Advanced OOP** - Inheritance, Polymorphism, Abstract classes
- **Interface Design** - Discountable interface for flexible pricing
- **Collections Framework** - ArrayList with polymorphic object storage
- **Business Logic** - Real-world e-commerce calculations

## Architecture Overview

```
📁 E-Shop System
├── 📄 Product.java (Abstract base class)
├── 📄 Electronics.java (Extends Product, implements Discountable)
├── 📄 Books.java (Extends Product, implements Discountable)
├── 📄 Clothing.java (Extends Product only)
├── 📄 Discountable.java (Interface for discount behavior)
├── 📄 ShoppingCart.java (Cart management with polymorphism)
└── 📄 Main.java (Application entry point)
```

## 🎯 Key OOP Concepts Demonstrated

### Inheritance Hierarchy

```java
Product (Abstract)
├── Electronics implements Discountable
├── Books implements Discountable  
└── Clothing (no discounts)
```

### Polymorphism in Action
```java
ArrayList<Product> products = new ArrayList<>();
// Can store Electronics, Books, Clothing objects
// Each behaves differently for shipping and discounts
```

### Interface Implementation
```java
public interface Discountable {
    double calculateDiscount(int quantity);
    void applySeasonalDiscount();
}
```

## How to Run

**Clone the repository**
```bash
git clone https://github.com/JinderO/eshop-system-java.git
cd eshop-system-java
```

**Compile the project**
```bash
javac -d bin src/dev/jov/*.java
```

**Run the application**
```bash
java -cp bin dev.jov.Main
```

## Business Logic Implementation

### Product Categories with Different Shipping

- **Electronics**: 150 Kč shipping + seasonal discounts
- **Books**: 50 Kč shipping + quantity discounts (5+ items = 10% off)
- **Clothing**: 80 Kč shipping + no discounts

### Smart Discount System

- **Quantity Discounts**: Automatic for eligible products
- **Seasonal Discounts**: Applied independently
- **Interface-based**: Easy to extend with new discount types

## What I Learned

- **Abstract Classes vs Interfaces** - When to use each approach
- **Polymorphic Collections** - Managing different object types uniformly
- **Interface Segregation** - Not all products need all behaviors
- **Business Logic Modeling** - Translating real-world rules into code
- **Flexible Design Patterns** - Easy to add new product types or discounts

## Code Highlights

**Polymorphic Cart Management:**
```java
public double calculateTotal() {
    double total = 0;
    for (int i = 0; i < products.size(); i++) {
        Product product = products.get(i);
        int quantity = quantities.get(i);
        total += (product.getPrice() * quantity) + product.calculateShipping();
    }
    return total;
}
```

**Interface-based Discount Application:**
```java
public void applyDiscounts() {
    for (Product product : products) {
        if (product instanceof Discountable) {
            ((Discountable) product).applySeasonalDiscount();
        }
    }
}
```

## Potential Extensions

- Add user authentication system
- Implement order persistence to database
- Create web interface with Spring Boot
- Add payment processing simulation
- Implement inventory management
- Add product search and filtering

## 👨‍💻 Author

**Jindřich Ovádek** - *Java Developer in Training* - [@JinderO](https://github.com/JinderO)

### Technical Achievements

- **Advanced OOP Mastery** - Demonstrates sophisticated understanding of inheritance and polymorphism
- **Interface Design Excellence** - Clean separation of concerns with flexible discount system
- **Complex Business Logic** - Real-world e-commerce calculations and rule implementation
- **Scalable Architecture** - Extensible design patterns for future enhancements
- **Polymorphic Collections** - Professional management of diverse object types in unified structures

This project showcases **advanced Java programming skills** including **inheritance hierarchies**, **interface design**, **polymorphic collections**, and **complex business logic implementation** typical of real-world **e-commerce systems**. The implementation demonstrates **enterprise-level thinking** and **scalable design patterns**.

---

⭐ **If you found this project helpful, please give it a star!** ⭐
