package src;

import java.util.Scanner;  

import src.Adventurer.Adventurer;
import src.Item.Item;
import src.Item.ItemType;
import src.Item.Rarity;
import src.Mission.Mission;
import src.Reward.Reward;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("      INICIANDO A AVENTURA SOLO");
        System.out.println("========================================\n");

        //criação do aventureiro
        Scanner scanner = new Scanner(System.in);
        System.out.print("Diga o nome do herói: ");
        String heroName = scanner.nextLine();

        Adventurer hero = new Adventurer(heroName);

        System.out.println("\n===================\n"
            + "Herói criado: " + hero.getName() 
            + "\nNível: " + hero.getLevel()
            + "\nXP: " + hero.getExperience() 
            + "\n===================" + "\n"
        );


        //criação do inventário inicial
        Item sword = new Item("Espada de ouro", "Espada... feita de ouro...", ItemType.WEAPON, Rarity.UNCOMMON, 2);
        hero.getInventory().addItem(sword);
        System.out.print("-- Inventário atual --\n\n");
        hero.getInventory().getItems();
        System.out.print("----------------------\n\n");

        //criação de itens para serem conquistados em missões
        Item potion = new Item("Poção de regeneração", "Poção que regenera vida", ItemType.POTION, Rarity.COMMON);
        Item armor = new Item("Capacete de ferro", "Capacete feita de 5 barras de ferro", ItemType.ARMOR, Rarity.RARE, 3);

        //criação de lista de recompensas
        List<Item> firstMissionItems = new ArrayList<>();
        firstMissionItems.add(potion);
        firstMissionItems.add(armor);
        Reward firstMissionReward = new Reward("Recompensa por derrotar o Cogumelo Mutante da Floresta Sombria", firstMissionItems, 150);

        //criação de missão
        Mission firstMission = new Mission("Derrotar o Cogumelo Mutante da Floresta Sombria", firstMissionReward, 1);

        System.out.println("Missão Disponível: " + firstMission.getTitle() + " | Level requirido: " + firstMission.getLevelRequired() + "\nStatus atual da missão: " + firstMission.getState() + "\n");
        System.out.println("Iniciando missão: " + firstMission.getTitle());
        firstMission.start(hero); //usa o aventureiro sem guardá-lo, logo associação
        System.out.println("Status da missão atual: " + firstMission.getState() + "\n");

        // ---------------------------------------------------------------
        // 6) Concluir a missão e entregar a recompensa ao aventureiro
        //    receiveReward altera o estado do Adventurer (xp, nível, inventário)
        // ---------------------------------------------------------------

        // ---------------------------------------------------------------
        // 7) Validação em ação: tentar concluir a mesma missão de novo
        // ---------------------------------------------------------------

        
        // ---------------------------------------------------------------
        // 8) Validação em ação: tentar iniciar uma missão acima do nível do aventureiro
        // ---------------------------------------------------------------

        // ---------------------------------------------------------------
        // 9) Uma missão que vai falhar (demonstra o enum MissionState.FAILED)
        // ---------------------------------------------------------------

        // ---------------------------------------------------------------
        // 10) Estado final do aventureiro e seu inventário
        // ---------------------------------------------------------------

    }
}