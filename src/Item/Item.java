package src.Item;

import src.Rarity;

public class Item {
    private final String name;
    private final String description;
    private final ItemType type;
    private final Rarity rarity;
    private int level;

    public Item(String name, String description, ItemType type, Rarity rarity) {
        this("", type.toString(), type, rarity, 1); 
    }

    public Item(String name, String description, ItemType type, Rarity rarity, int level) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.rarity = rarity;
        this.level = level;
    }
    
    public String getName() { return name; }
    public String getDescription() { return description; }
    public ItemType getType() { return type; }
    public Rarity getRarity() { return rarity; }
    public int getLevel() { return level; }

    public void increaseLevel(int increase) { level += increase; }
}
