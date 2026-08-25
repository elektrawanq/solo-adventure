package src.Reward;

public class Reward {
    private final String description;
    private int energy;
    private int level;

    public Reward(String description, int energy) {
        this.description = description;
        this.energy = energy;
    }

    public String getDescription() { return description; }
    public int getEnergy() { return energy; }
}
