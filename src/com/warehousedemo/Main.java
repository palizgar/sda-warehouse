package com.warehousedemo;

public class Main {
    public static void main(String[] args) {
        Product table = new Furniture(30, 21.5, "foldable table");
        Product wardrobe = new Furniture(20, 45.5, "standAlone");

        System.out.println("The model of table is:");
        System.out.println(table.getName());

        System.out.println(wardrobe.addProduct(4));
        table.removeProduct(56);


        System.out.println("The current available products: ");
        System.out.println(wardrobe.getName() + ": " + wardrobe.getQuantity());
        System.out.println(table.getName() + ": " + table.getQuantity());
    }
}
