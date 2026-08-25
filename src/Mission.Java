package src;

public class Mission {
    private final String title;
    private final Reward reward;
    private MissionState state;

    public Mission(String title, Reward reward) {
        this.title = title;
        this.reward = reward;
        this.state = MissionState.NOT_STARTED;
    }

    public String getTitle() { return title; }
    public Reward getReward() { return reward; }
    public MissionState getState() { return state; } 
    
    public void start(){
        this.state = MissionState.IN_PROGRESS;

    }

    public Reward conclude() {
        this.state = MissionState.COMPLETED;
        return reward;
    }

    public void fail(){
        this.state = MissionState.FAILED;
    }
}