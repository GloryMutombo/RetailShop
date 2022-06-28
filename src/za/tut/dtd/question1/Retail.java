package za.tut.dtd.question1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Retail {

    private String name;
    private List<Item> availableItems;
    private List<Item> soldItems;

    public Retail() {
        this.name = "";
        this.availableItems = new ArrayList<>();
        this.soldItems = new ArrayList<>();

    }

    public void displayAvailableStock() {

        System.out.println("Class Name" + "\t" + "Item Name" + "\t" + "Size" + "\t" + "Total" + "\n");

        for (int x = 0; x < availableItems.size(); x++) {
            Item item = availableItems.get(x);

            System.out.println(item.getClassName() + "\t" + item.getName() + "\t" + item.getSize() + "\t" + item.getTotal() + "\n");

        }



    }

    public void addItem(Item item) {
        this.availableItems.add(item);
    }

    public double calculateTotalSales() {
        double totalSales = 0;

        for (int i = 0; i < this.soldItems.size(); i++) {
            Item item = this.soldItems.get(i);
            double total = item.getTotal();
            totalSales = totalSales + total;
        }
        return totalSales;
    }

    public void sellItem(String name, int size) {

        Item foundItem = null;
        for (int i = 0; i < this.availableItems.size(); i++) {
            Item item = this.availableItems.get(i);
            if (item.getName().equals(name) && item.getSize() == size) {
                foundItem = item;
                break;
            }
        }

        if (foundItem == null) {
            System.out.println("No stock");
        } else {
            this.availableItems.remove(foundItem);
            this.soldItems.add(foundItem);

            LocalDate expirationDate = foundItem.getExpirationDate();
            int days = expirationDate.compareTo(LocalDate.now());

            System.out.println(foundItem.getName() + "\t" + foundItem.getSize() + "\t" + days + "\n");
        }
    }

}
