package com.sda;

public class Employee extends Person {
    private int workingHours;

    public Employee(String name) {
        super(name);
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
}
