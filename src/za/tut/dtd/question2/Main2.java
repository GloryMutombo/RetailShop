package za.tut.dtd.question2;

import za.tut.dtd.question1.Detergent;
import za.tut.dtd.question1.Drink;
import za.tut.dtd.question1.Item;

import java.time.LocalDate;

public class Main2 {
    public static void main(String[] args) {
        RetailFiFo retailFiFo= new RetailFiFo();
        Item drink1 = new Drink("Drink", "Fanta", 1, 5, LocalDate.of(2022, 4, 20), 20, "fruit drink");
        Item drink2 = new Drink("Drink", "Coke", 2, 10, LocalDate.of(2022, 4, 20), 40, "fuzzy drink");

        Item detergent = new Detergent("Omo","Handy",2,20,LocalDate.of(2020,12,20),50,"Powder");

        retailFiFo.addItem(drink1);
        retailFiFo.addItem(drink2);
        retailFiFo.addItem(detergent);
        System.out.println("The number of  availables items is: "+retailFiFo.getAvailableItems().size());

        Item sellItem = retailFiFo.sellItem("Fanta", 1);
        System.out.println(sellItem.getClassName());
        System.out.println(sellItem.getName());
        System.out.println("After to sell the number of remaining items  is:"+ retailFiFo.getAvailableItems().size());


    }
}
