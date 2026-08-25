package src.Adventurer;

import src.Reward.Reward;

public class Adventurer {
    private final String name;
    private int energy;

    public Adventurer(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }
    
    public String getName() { return name; }
    public int getEnergy() { return energy; }

    public void receiveEnergy(Reward reward) { energy += reward.getEnergy(); }
}
