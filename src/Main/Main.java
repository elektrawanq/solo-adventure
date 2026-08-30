package src.Main;

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

        scanner.close();

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
        
        //iniciando missão e ocorrência de associação
        System.out.println("Iniciando missão: " + firstMission.getTitle());
        firstMission.start(hero); //usa o aventureiro sem guardá-lo, logo associação
        System.out.println("Status da missão atual: " + firstMission.getState() + "\n");

        //concluindo missão 
        System.out.println("Concluindo missão: " + firstMission.getTitle());
        Reward earnedReward = firstMission.conclude();
        hero.receiveReward(earnedReward);
        System.out.println("Status da missão atual: " + firstMission.getState() + "\n");

        //tentando concluir de novo
        System.out.println("---- Tentando concluir missão ja completa: " + firstMission.getTitle() + " ----");
        firstMission.conclude();
        System.out.println("-----------------------------------------------------------------------------------------------\n");

        //tentando iniciar de novo
        System.out.println("---- Tentando iniciar missão ja completa: " + firstMission.getTitle() + " ----");
        firstMission.start(hero);
        System.out.println("----------------------------------------------------------------------------------------------\n");
        
        //criando missão acima do nivel do heroi
        Item godShield = new Item("Escudo muito forte", "Escudo muito forte", ItemType.ARMOR, Rarity.LEGENDARY, 10);
        List<Item> dragonMissionItems = new ArrayList<>();
        dragonMissionItems.add(godShield);
        Reward dragonReward = new Reward("Tesouro do Dragão Ancião", dragonMissionItems, 500);
        Mission dragonMission = new Mission("Enfrentar o Dragão Ancião", dragonReward, 10);

        //tentando iniciar ela mesmo o heroi nao tendo o nivel necessario
        System.out.println("--- Tentando iniciar a missão do Dragão (nível exigido: 10) ---");
        dragonMission.start(hero); 
        System.out.println("Estado da missão do Dragão: " + dragonMission.getState() + "\n------------------------------------------------------------------\n");

        //criando missão 2
        Item shield = new Item("Escudo forte", "Escudo forte", ItemType.ARMOR, Rarity.RARE, 4);
        List<Item> secondMissionItems = new ArrayList<>();
        secondMissionItems.add(shield);
        Reward secondMissionReward = new Reward("Tesouro do Mago das Trevas", secondMissionItems, 300);
        Mission secondMission = new Mission("Enfrentar o Mago das Trevas", secondMissionReward, 2);

        //falhando missão 2
        System.out.println("--- Iniciando e falhando a missão do Mago ---\n");
        secondMission.start(hero);
        System.out.println("Estado antes de falhar: " + secondMission.getState());
        secondMission.fail();
        System.out.println("Estado depois de falhar: " + secondMission.getState() + "\n");
        System.out.println("----------------------------------------------\n");

        //estado final do heroi
        System.out.println("========================================");
        System.out.println("   ESTADO FINAL DO AVENTUREIRO");
        System.out.println("========================================");
        System.out.println("Nome: " + hero.getName());
        System.out.println("Nível: " + hero.getLevel());
        System.out.println("XP: " + hero.getExperience());
        System.out.println("\nInventário:");
        hero.getInventory().getItems();

    }
}