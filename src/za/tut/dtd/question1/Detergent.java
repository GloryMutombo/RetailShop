package za.tut.dtd.question1;

import java.time.LocalDate;

public class Detergent extends Item {

    private String indicator;

    public Detergent(String className, String name, int size, int total, LocalDate expirationDate, double price, String indicator) {
        super(className, name, size, total, expirationDate, price);
        this.indicator = indicator;
    }
}
