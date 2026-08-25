package src;

public class Mission {
    private final String title;
    private final Reward reward;
    private boolean completed;

    public Mission(String title, Reward reward) {
        this.title = title;
        this.reward = reward;
        this.completed = false;
    }

    public String getTitle() { return title; }
    public Reward getReward() { return reward; }
    public boolean getCompleted() { return completed; } 
    
    public Reward conclude() {
        completed = true;
        return reward;
    }
}