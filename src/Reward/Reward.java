package src.Reward;

import src.Item.Item;

import java.util.List;

public class Reward {
    private final String description;
    private List<Item> items;
    private int experience;

    public Reward(String description, List<Item> items, int experience) {
        this.description = description;
        this.items = items;
        this.experience = experience;
    }

    public String getDescription() { return description; }
    public List<Item> getListItem() { return items; }
    public int getExperience() { return experience; }
}
