# Atividade 1 em grupo — Base da Aventura Solo

## Solo Adventure - Link do Projeto no  Github

https://github.com/elektrawanq/solo-adventure.git

## Equipe

- Acírio Gabriel Ferreira Barbosa
    - email: agabrielfb11@gmail.com 
    - **Observação:** Informamos que Acírio não participa desta turma de LP2, ele está matriculado em outra turma no IMD. No entanto, enquanto a turma dele está sem professor, ele se ofereceu para colaborar no projeto. Obrigado(a), Acírio!
- Bruno Ferreira da Silva 
    - email: brenoouhd@gmail.com
- Gabriel Vilar
    - email: gabrielbrandaovilar@gmail.com
- Letícia Queiroz Wanderley 
    - email: leticia.queiroz.109@ufrn.edu.br

## Descrição do Jogo Solo Adventure

## Checklist de Implementação

- [x] Classes mínimas: 
    - [x] Aventureiro (`Adventurer.java`)
    - [x] Inventario (`Inventory.java`)
    - [x] Item (`Item.java`)
    - [x] Missao (`Mission.java`)
    - [x] Recompensa (`Reward.java`)
- [x] Enums mínimos:
    - [x] TipoItem (`Item/ItemType.java`)
    - [x] Raridade (`Item/Rarity.java`)
    - [x] EstadoMissao (`Mission/MissionState.java`)

### O projeto deverá demonstrar:

- [x] atributos protegidos com private
- [x] métodos responsáveis por alterar o estado dos objetos
    - Exemplos: addItem(Item item) em `Inventory.java`, increaseLevel(int increase) em `Item.java`, start(Adventurer adventurer), conclude() e fail() em `Mission.java`
- [x] pelo menos uma associação
    - ver linhas 60 a 62 em `Main.java`

- [x] pelo menos uma agregação

- [x] pelo menos uma composição

- [x] utilização dos três enum
    - `Rarity.java` e `ItemType.java` são usados em `Item.java`; 
    - `MissionState.java`é usado em `Mission.java`.

- [x] coleções quando houver multiplicidade, por exemplo List<Item>
    - Em `Inventory.java`, temos a declaração da classe inventário que possui como atributo privado uma lista do tipo `List<Item>`.

- [x] validações que impeçam estados inválidos
- [x] uma classe Main demonstrando o funcionamento

Descrição:

Objetivo: desenvolver, em Java, a estrutura inicial de uma aventura solo utilizando orientação a objetos.

Sempre enviar um documento de texto contendo o que foi implementado, destacando cada parte da tarefa.