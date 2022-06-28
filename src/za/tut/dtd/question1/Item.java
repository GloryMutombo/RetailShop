package za.tut.dtd.question1;

import java.time.LocalDate;
import java.util.Objects;

public class Item {
    private String className;
    private String name;
    private int size;
    private int total;
    private LocalDate expirationDate;
    private double price;

    public Item(String className, String name, int size, int total, LocalDate expirationDate, double price) {
        this.className = className;
        this.name = name;
        this.size = size;
        this.total = total;
        this.expirationDate = expirationDate;
        this.price = price;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return size == item.size && className.equals(item.className) && name.equals(item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(className, name, size);
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int viewExpiry() {
        int days = this.expirationDate.compareTo(LocalDate.now());
        if (days <= 1) {
            System.out.println("ITEM EXPIRED");
        }
        return days;
    }
}
