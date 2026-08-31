# Atividade 1 em grupo — Base da Aventura Solo

## Solo Adventure - Link do Projeto no  Github

https://github.com/elektrawanq/solo-adventure.git

## Equipe

- Acírio Gabriel Ferreira Barbosa
    - email: agabrielfb11@gmail.com 
    - **Observação:** Informamos que Acírio não participa desta turma de LP2, ele está matriculado em outra turma no IMD. No entanto, enquanto a turma dele está sem professor, ele se ofereceu para colaborar no projeto. Obrigado(a), Acírio!
- Bruno Ferreira da Silva 
    - email: brenoouhd@gmail.com
- Gabriel Brandão Vilar
    - email: gabrielbrandaovilar@gmail.com
- Letícia Queiroz Wanderley 
    - email: leticia.queiroz.109@ufrn.edu.br

## Descrição do Jogo Solo Adventure

Solo Adventure é um jogo em que o nosso corajoso `Adventurer` está destinado a cumprir `Mission`'s. Ele possui um `Inventory`, no qual carrega todos os `Item`'s necessários para sua sobrevivência nessa jornada desafiante: comida, armas para sua defesa, armadura e poções mágicas. Ao longo de suas expedições, ele precisará desses itens para combater o mal e concluir suas `Mission`'s. Ao final de cada `Mission`, nosso inestimável sobrevivente receberá uma `Reward`, que é uma lista de `Item`'s. Cada `Item` possui um `ItemType` e uma `Rarity`, e missões especiais implicam o recebimento de itens mais raros. Além disso, nosso valoroso herói também ganhará experiência com as situações vividas, elevando sua `experience` que é o atributo que ajuda seu `level` a subir. Seu `level` também é o que aponta se o `Adventurer` pode realizar a missão. Assim, é uma meta pessoal do nosso herói provar seu valor para poder atuar em missões mais árduas e com `Reward`'s mais valiosas.

### Observações Relevantes e Desejos de Aprimoramento

- Há um arquivo `Adventurer/Role.java` que é um enum representando tipos de personagens que desejamos implementar futuramente no jogo. Cada personagem possuirá habilidades específicas, que também possuirão níveis - o nosso querido `Adventurer` poderá se tornar um Sapientíssimo Mago  ou até mesmo um Infalível Arqueiro! Todavia, devido ao tempo, deixamos essa funcionalidade para depois.
- Tentamos usar o idioma inglês para autodesenvolvimento no nosso trabalho, mas acabamos utilizando português para as mensagens de interação com o usuário. Buscamos manter toda a estrutura do jogo em inglês futuramente quando houver uma janela de tempo maior para tradução.


## Checklist de Implementação

- [x] Classes mínimas: 
    - [x] Aventureiro (`Adventurer/Adventurer.java`)
    - [x] Inventario (`Inventory/Inventory.java`)
    - [x] Item (`Item/Item.java`)
    - [x] Missao (`Mission/Mission.java`)
    - [x] Recompensa (`Reward/Reward.java`)
- [x] Enums mínimos:
    - [x] TipoItem (`Item/ItemType.java`)
    - [x] Raridade (`Item/Rarity.java`)
    - [x] EstadoMissao (`Mission/MissionState.java`)

### O projeto deverá demonstrar:

- [x] atributos protegidos com private
    - ver `Inventory/Inventory.java`, `Item/Item.java`, `Mission/Mission.java` e `Reward/Reward.java`.

- [x] métodos responsáveis por alterar o estado dos objetos
    - Exemplos: addItem(Item item) em `Inventory/Inventory.java`, increaseLevel(int increase) em `Item/Item.java`, start(Adventurer adventurer), conclude() e fail() em `Mission/Mission.java`.

- [x] pelo menos uma associação
    - ver linhas 60 a 62 em `Main/Main.java`.

- [x] pelo menos uma agregação
    - ver `Main/Main.java`: firstMissionReward é criada isoladamente e passada como parâmetro para a criação da classe `Mission`. Se a firstMission for destruída, a recompensa em si ainda existe como uma entidade separada. Se firstMissionReward for destruída, os objetos potion e armor continuam existindo no código.

- [x] pelo menos uma composição
    - ver linha 21 em Adventurer(String name) no arquivo `Adventurer/Adventurer.java`

- [x] utilização dos três enum
    - `Item/Rarity.java` e `Item/ItemType.java` são usados em `Item/Item.java`; 
    - `Mission/MissionState.java` é usado em `Mission/Mission.java`.

- [x] coleções quando houver multiplicidade, por exemplo List<Item>
    - Em `Inventory/Inventory.java`, temos a declaração da classe inventário que possui como atributo privado uma lista do tipo `List<Item>`.

- [x] validações que impeçam estados inválidos
    - ver start(Adventurer adventurer) e conclude() em `Mission/Mission.java`.

- [x] uma classe Main demonstrando o funcionamento
    - ver `Main/Main.java`.

## Como Compilar e Executar Solo Adventure

- Use para compilar: `javac -d bin (Get-ChildItem -Recurse src/*.java)`
- Use para executar: `java -cp bin src.Main.Main`