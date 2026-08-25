package src;

public class Adventurer {
    private final String name;
    private int energy;

    public Adventurer(String name, int energy) {
        this.name = name;

        if (energy < 0) {
            System.out.println("Error: energy cannot be negative. Setting to 0.");
            this.energy = 0;
        } else {
            this.energy = energy;
        }
    }
    
    public String getName() { return name; }
    public int getEnergy() { return energy; }

    public void receiveEnergy(Award award) { energy += award.getEnergy(); }
}
