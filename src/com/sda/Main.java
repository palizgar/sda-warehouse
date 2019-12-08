package com.sda;

public class Main {

    public static void main(String[] args) {
        // created a company object
        Company<Person> aCompany = new Company<>("SDA");

        // create trainer and sponsor objects
        // trainer and sponsor are both Person as well
        Person trainer = new Employee("Sam");
        trainer.setRole("Trainer");

        Person sponsor = new Person("John");
        sponsor.setRole("Sponsor");

        // hire trainer
        aCompany.hire(trainer);

        // hire sponsor
        aCompany.hire(sponsor);
    }
}

