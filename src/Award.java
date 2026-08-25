package src;

public class Award {
    private final String description;
    private int energy;

    public Award(String description, int energy) {
        this.description = description;
        this.energy = energy;
    }

    public String getDescription() { return description; }
    public int getEnergy() { return energy; }
}