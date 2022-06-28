package za.tut.dtd.question2;

import za.tut.dtd.question1.Item;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RetailFiFo {

    private String name;

    public Queue<Item> getAvailableItems() {
        return availableItems;
    }

    private Queue<Item> availableItems;
    private List<Item> soldItems;

    public RetailFiFo() {
        this.name = "";
        this.availableItems = new LinkedList<>();
        this.soldItems = new ArrayList<>();

    }

    public void addItem(Item item) {
        this.availableItems.add(item);
    }

    public Item sellItem(String name, int size) {

        Item foundItem = null;
        while (!availableItems.isEmpty()) {
            Item availableItem = availableItems.peek();
            if (availableItem.getName().equals(name) && availableItem.getSize() == size) {
                foundItem = availableItem;
                break;
            }
        }
        if (foundItem != null) {
            this.availableItems.remove(foundItem);
            this.soldItems.add(foundItem);
        }

        return foundItem;
////second way
//        Item polledItem = this.availableItems.poll();
//        this.soldItems.add(polledItem);
//
//        System.out.println(soldItems);
    }

}
