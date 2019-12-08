package com.warehousedemo;


public class Furniture extends Product {

    public Furniture(int quantity, double price, String name) {
        super(quantity, price, name);
    }

    public int addProduct(int numberToAdd) {
        this.quantity += numberToAdd;
        return this.quantity;
    }

    public int removeProduct(int numberToRemove) {
        int newQuantity = this.quantity - numberToRemove;
        if (newQuantity < 0) {
            System.out.println("there is not enough " + this.getName());
            return this.quantity;
        }
        this.quantity = newQuantity;
        return newQuantity;
    }


}
