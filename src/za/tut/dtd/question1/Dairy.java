package za.tut.dtd.question1;

import java.time.LocalDate;

public class Dairy extends Item {

    private double temperature;

    public Dairy(String className, String name, int size, int total, LocalDate expirationDate, double price, double temperature) {
        super(className, name, size, total, expirationDate, price);
        this.temperature = temperature;
    }
}
