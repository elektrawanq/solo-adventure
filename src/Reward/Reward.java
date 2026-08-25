package src.Reward;

import src.Item.Item;

public class Reward {
    private final String description;
    private Item item;
    private int experience;


    public Reward(String description, Item item, int experience) {
        this.description = description;
        this.item = item;
        this.experience = experience;
    }

    public String getDescription() { return description; }
    public Item getItem() { return item; }
    public int getExperience() { return experience; }
}
