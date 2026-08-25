package src.Adventurer;

import src.Inventory.Inventory;
import src.Item.Item;
import src.Reward.Reward;

import java.util.ArrayList;
import java.util.List;

public class Adventurer {
    private final String name;
    private int experience; // xp
    private int level;  // nível
    private Inventory inventory;
   // private Classe classe;


    public Adventurer(String name, Inventory inventory) {
        this.name = name;
        this.experience = 0; //Experiencia incial de um aventureiro
        this.level = 1; //Nivel inicial de um aventureiro
        this.inventory = inventory;
    }

    //Sobrecarga de construtor para o caso de ser necessario criar um personagem com um determinado nivel
    public Adventurer(String name, int level, Inventory inventory) {
        this.name = name;
        this.experience = 0; //Experiencia incial de um aventureiro
        this.level = level;
        this.inventory = inventory;
    }
    
    public String getName() {  return name; }
    public int getExperience() { return experience; }
    public int getLevel() { return level; }


    //Recebe a experiencia e o item de recompensa
    public void receiveReward(Reward reward) {
        int verificador = 0;
        experience += reward.getExperience();

        //Loop que verifica se ha experiencia necessaria para subir de nivel, equanto houver experiencia para subir de nivel,
        //ele subira
        while (experience >= (level * 100)){ //Faz com que a cada nivel seja preciso mais experiencia para subir de nivel
            experience -= level * 100; // olhar esse fator
            level += 1;
            verificador += 1;
        }

        //So imprime o texto caso tenha tido aumento de nivel. Nao coloquei dentro do loop para que so imprima a mudança uma vez.
        if(verificador > 0){
            System.out.println(name + " subiu para o nivel " + level + "!\n");
        }

        addListItem(reward.getListItem());
    }

    public void addListItem(List<Item> listItem) {
        for(Item item : listItem) {
            inventory.addItem(item);
        }
        System.out.println("Os itens:\n");
        for(Item item : listItem) {
            System.out.println(item.getName() + "\n");
        }
        System.out.println("foram adicionados ao inventario de " + name + " com sucesso!\n");
    } 
}
