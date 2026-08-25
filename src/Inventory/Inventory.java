package src.Inventory;

import src.Item.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void getItems() {
        if(items.isEmpty()){
            System.out.println("O inventário está vazio.\n");
            return;
        }

        for(int i = 0; i < items.size(); i++){
            System.out.println((i+1) + ". " + items.get(i).getName() + "\n"); // "1. Nome do item"
        }
    }

    public void addItem(Item item) {
        items.add(item);
    }
}
