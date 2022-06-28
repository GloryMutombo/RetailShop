package za.tut.dtd.question1;

import java.time.LocalDate;

public class Drink extends Item {
    private String type;

    public Drink(String className, String name, int size, int total, LocalDate expirationDate, double price, String type) {
        super(className, name, size, total, expirationDate, price);
        this.type = type;
    }
}
