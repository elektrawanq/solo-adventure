package src;
public class Item {
    private final String description;
    private final ItemType type;
    private final Rarity rarity;
    private int level;

    public Item(String description, ItemType type, Rarity rarity) {
        this(type.toString(), type, rarity, 1); 
    }

    public Item(String description, ItemType type, Rarity rarity, int level) {
        this.description = description;
        this.type = type;
        this.rarity = rarity;
        this.level = level;
    }

    public String getDescription() { return description; }
    public ItemType getType() { return type; }
    public Rarity getRarity() { return rarity; }
    public int getLevel() { return level; }
}
