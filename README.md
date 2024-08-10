# Projeto: Gerenciador de Estacionamento

## Sobre
- O projeto em questão consiste em um gerenciador de estacionamento feito com Java. Ele possibilita que, por meio de um menu interativo, clientes sejam cadastrados, o número de vagas restantes sejam visualizadas, permite que seja visualizado o nome e o tipo de veículo 
que o cliente possui e permite também que o recibo do cliente seja exibido. 
- O meu objetivo desenvolvendo o projeto foi, sobretudo, treinar as minhas habilidades na construção de projetos utilizando Programação Orientada a Objetos com Java.
- A ideia para o projeto surgiu a partir do livro "Java - como programar". Estava resolvendo questões de um capítulo do livro e uma das questões consistia em criar um gerenciador de estacionamento. Ao finalizar a questão percebi que eu poderia melhorar e adicionar
mais funcionalidades que deixariam o projeto mais completo.

## Como Funciona
- Ao inicializar o programa, o usuário se depara com um menu de opções, que são:
  1.  Cadastrar novo cliente
  2.  Exibir recibo do cliente
  3.  Exibir lista de clientes cadastrados
  4.  Visualizar vagas restantes
  5.  Sair

  ![image](https://github.com/user-attachments/assets/7c828cfe-67b3-4e3e-a0db-3f479b064893)

- **Para a primeira opção**: O usuário deverá informar o nome do cliente a ser cadastrado, depois informar o tipo de veículo do cliente (carro ou moto), por fim, informar se o cliente vai deixar o veículo por horas ou dias e, a partir da opção inserida, informar a quantidade
de horas ou de dias. Caso o estacionamento possua vagas disponíveis, o cliente será cadastrado, caso contrário, será informado que o estacionamento está sem vagas restantes.

  ![image](https://github.com/user-attachments/assets/b81c7423-fd09-4261-b462-872dbca57f33)

- **Para a segunda opção**: Será exibido uma lista de clientes cadastrados. Caso possua clientes cadastrados, o sistema retornará o nome dos clientes cadastrados e o usuário deve digitar o nome do cliente que ele deseja exibir o recibo. Caso o cliente seja encontrado,
o recibo do mesmo será exibido e a vaga que ele ocupava será liberada.
  - para o valor que será exibido no recibo do cliente, o cálculo é feito com base no tipo do veículo e no tempo, se em dias ou horas.

  ![image](https://github.com/user-attachments/assets/b9548574-aebf-4ed3-bb15-15740bb5283b)

- **Para a terceira opção**: Caso o sistema possua clientes cadastrados, o nome e o tipo de veículo vão ser retornados. Caso contrário, uma mensagem será exibida: "Nenhum cliente cadastrado".

  ![image](https://github.com/user-attachments/assets/b7fbdf15-8eaa-4b80-8379-70c89bcf53a7)

- **Para a quarta opção**: O número de vagas restantes será retornado. O cálculo é feito com base na quantidade de vagas definidas e o número de clientes cadastrados (cada cliente cadastrado ocupa uma vaga).

  ![image](https://github.com/user-attachments/assets/5597579f-4a4f-460c-a99d-0d72d84b7b51)

- **Para a quinta opção**: A execução do código será finalizada.


## Estrutura das Pastas
    /src               # Código fonte principal da aplicação
        /Application   # Pasta que contém a classe main, responsável por rodar a aplicação 
        /Entities      # Pasta que contém as outras classes do código como as classes: Carro, Moto, Cliente, GerenciarEstacionamento e Veículo (classe abstrata)
        
## Tecnologias e Linguagens Utilizadas
- **Java**: tecnologia única do projeto, que foi utilizada para a criação de todo o projeto. Além disso, foi utilizado conceitos de POO do Java.

## Funcionalidades
- Classe GerenciarEstacionamento: Como o próprio nome diz, essa classe é responsável por gerenciar o estacionamento, logo nela estão incluídos a lógica para os códigos responsáveis por adicionar os clientes, exibir o recibo dos clientes e exibir as vagas restantes
e os clientes cadastrados. Além disso, nessa classe é definido o número de vagas do estacionamento.
- Classe Veículo: Classe abstrata com métodos abstratos para definir os métodos que cada tipo de veículo vai possuir, que são calcularTaxa e exibirRecibo.
- Classe Carro: Classe que implementa os métodos da classe Veículo. As implementações servem para definir como vai funcionar o cálculo do recibo do cliente com base em variáveis definidas na classe e como o recibo será exibido.
- Classe moto: Funciona da mesma forma que a classe Carro, a mudança ocorre nos valores das variáveis, que são adaptadas para o veículo moto.
- Classe Cliente: Permite definir como o cliente será definido. Dessa forma, dois construtores são adicionados, um para o cliente que vai deixar o veículo para uma certa quantidade de horas e outro para o cliente que vai deixar o veículo por dias.
- Classe Estacionamento: Classe principal que permite que o programa rode. Por meio dela, o usuário pode interagir com o sistema e utilizar todas as funcionalidades que o projeto oferece.

## Como executar (falta fazer!)
