package com.sda;

public class Company<T extends Person> {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public void hire(T workForce) {
        System.out.println("hired ! welcome " + workForce.getName());
        System.out.println(workForce.getName() + " is our new " + workForce.getRole());
    }
}
