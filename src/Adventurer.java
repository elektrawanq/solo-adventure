package src;

public class Adventurer {
    private final String name;
    private int energy;

    public Adventurer(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }
    
    public String getName() { return name; }
    public int getEnergy() { return energy; }

    public void receiveEnergy(Award award) { energy += award.getEnergy(); }
}
