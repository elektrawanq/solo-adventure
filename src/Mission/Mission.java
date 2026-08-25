package src.Mission;

import src.Adventurer.Adventurer;
import src.MissionState;
import src.Reward.Reward;

public class Mission {
    private final String title;
    private final Reward reward;
    private MissionState state;
    private int levelRequired;

    public Mission(String title, Reward reward, int levelRequired) {
        this.title = title;
        this.reward = reward;
        this.levelRequired = levelRequired;
        this.state = MissionState.NOT_STARTED;
    }

    public String getTitle() { return title; }
    public Reward getReward() { return reward; }
    public MissionState getState() { return state; }
    public int getLevelRequired() {return levelRequired;}

    public void start(Adventurer adventurer) {
        if(state == MissionState.COMPLETED){
            System.out.println("Essa missão já foi concluida e nao pode mais ser realizada!\n");
        }

        if(adventurer.getLevel() < levelRequired){
            System.out.println("O aventureiro ainda nao pode realizar esta missao, ainda precisa subir " + (levelRequired - adventurer.getLevel()) + " niveis para estar apto.\n");
        }

        this.state = MissionState.IN_PROGRESS;
    }

    public Reward conclude() {
        this.state = MissionState.COMPLETED;

        //Diz qual recompensa a pessoa ganhou e abaixo quanto de experiencia a missao rendeu
        System.out.println("Parabens, a missao foi concluida! Voce recebera um(a) " + reward.getItem().getName() + " como recompensa.\n" + "+ " + reward.getExperience() + "xp\n");
        return reward;
    }

    public void fail() {
        System.out.println("Voce falhou! Tente novamente se quiser muito a recompensa.\n");
        this.state = MissionState.FAILED;
    }
}