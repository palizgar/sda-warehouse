package com.warehousedemo;

public abstract class Product {
    // because we're not using collections, we store each product quantity or
    // remaining value inside itself
    private int quantity;
    private double price;
    private String name;

    public Product(int quantity, double price, String name) {
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }

    // method to modify the quantity of each product
    public abstract int addProduct(int numberToAdd);

    public abstract int removeProduct(int numberToRemove);


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
