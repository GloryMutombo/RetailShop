package za.tut.dtd.question1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Retail retail = new Retail();

        Item drink1 = new Drink("Drink", "Coke", 1, 5, LocalDate.of(2022, 4, 20), 20, "fruit drink");
        Item drink2 = new Drink("Drink", "Coke", 2, 10, LocalDate.of(2022, 4, 20), 40, "fuzzy drink");

        Item detergent1 = new Detergent("Detergent", "Handy Handy", 1, 5, LocalDate.of(2022, 5, 19), 10, "liquid");
        Item detergent2 = new Detergent("Detergent", "Baby Powder", 2, 10, LocalDate.of(2022, 5, 19), 10, "powder");

        Item dairy1 = new Dairy("Dairy", "Imkhomazi", 1, 5, LocalDate.of(2022, 6, 10), 50, 23.5);
        Item dairy2 = new Dairy("Dairy", "Milk", 2, 10, LocalDate.of(2022, 6, 10), 60, 20.5);

        retail.addItem(drink1);
        retail.addItem(drink2);
        retail.addItem(detergent1);
        retail.addItem(detergent2);
        retail.addItem(dairy1);
        retail.addItem(dairy2);


        retail.displayAvailableStock();
    }
}
