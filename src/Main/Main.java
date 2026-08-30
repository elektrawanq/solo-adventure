package src;

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
        System.out.println("   INICIANDO A AVENTURA SOLO");
        System.out.println("========================================\n");

        // ---------------------------------------------------------------
        // 1) Criação do Aventureiro
        //    Composição: o Adventurer cria seu próprio Inventory internamente,
        //    ninguém de fora "empresta" um inventário pronto pra ele.
        // ---------------------------------------------------------------

        // ---------------------------------------------------------------
        // 2) Criação de Itens
        //    Usa os enums ItemType e Rarity nos próprios atributos do Item.
        // ---------------------------------------------------------------

        // ---------------------------------------------------------------
        // 3) Criação da Recompensa (Reward)
        //    Usa List<Item> pois uma recompensa pode ter vários itens (multiplicidade).
        // ---------------------------------------------------------------

        // ---------------------------------------------------------------
        // 4) Criação das Missões
        //    Agregação: a Mission recebe a Reward já pronta de fora.
        // ---------------------------------------------------------------

        // ---------------------------------------------------------------
        // 5) Validação em ação: tentar iniciar uma missão acima do nível do aventureiro
        // ---------------------------------------------------------------

        // ---------------------------------------------------------------
        // 6) Associação: Mission.start(Adventurer) usa o aventureiro sem guardá-lo
        // ---------------------------------------------------------------

        // ---------------------------------------------------------------
        // 7) Concluir a missão e entregar a recompensa ao aventureiro
        //    receiveReward altera o estado do Adventurer (xp, nível, inventário)
        // ---------------------------------------------------------------

        // ---------------------------------------------------------------
        // 8) Validação em ação: tentar concluir a mesma missão de novo
        // ---------------------------------------------------------------

        // ---------------------------------------------------------------
        // 9) Uma missão que vai falhar (demonstra o enum MissionState.FAILED)
        // ---------------------------------------------------------------

        // ---------------------------------------------------------------
        // 10) Estado final do aventureiro e seu inventário
        // ---------------------------------------------------------------

    }
}