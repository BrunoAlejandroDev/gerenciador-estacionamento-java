package Application;

import Entities.*;

import java.util.Locale;
import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        GerenciarEstacionamento gerenciarEstacionamento = new GerenciarEstacionamento();

        System.out.println("===== Estacionamento Fortaleza =====");
        while(true) {
            System.out.println("Menu inicial");
            System.out.println("1. Cadastrar novo cliente.");
            System.out.println("2. Exibir recibo do cliente.");
            System.out.println("3. Exibir lista de clientes cadastrados");
            System.out.println("4. Visualizar vagas restantes.");
            System.out.println("5. Sair.");
            System.out.print("Insira uma opção (campo numérico): ");
            int opcaoMenu = input.nextInt();
            System.out.println();

            switch (opcaoMenu) {
                case 1: // cadastrar novo cliente
                    // inserir o nome do cliente
                    input.nextLine();
                    System.out.print("Insira o nome do cliente: ");
                    String nome = input.nextLine();

                    // inserir e verificar o tipo de veículo
                    System.out.print("Insira o tipo de veículo (carro/moto): ");
                    String tipoVeiculo = input.next().toLowerCase();

                    Veiculo veiculoCliente;
                    if (tipoVeiculo.equals("carro")) {
                        veiculoCliente = new Carro();
                    }
                    else if (tipoVeiculo.equals("moto")) {
                        veiculoCliente = new Moto();
                    }
                    else {
                        System.out.println("ERROR: insira um tipo de veículo válido. Use 'carro' ou 'moto'.");
                        continue;
                    }

                    // inserir e verificar se vão ser horas ou dias e instanciar o cliente
                    System.out.print("O cliente vai deixar o carro por horas ou dias? (h/d): ");
                    char opcao = input.next().charAt(0);

                    Cliente cliente;
                    if (opcao == 'd') {
                        System.out.print("Insira a quantidade de dias que o veículo ficará estacionado: ");
                        int diasEstacionado = input.nextInt();
                        cliente = new Cliente(nome, veiculoCliente, diasEstacionado, true);
                    }
                    else {
                        System.out.print("Insira a quantidade de horas que o veículo ficará estacionado: ");
                        int horasEstacionado = input.nextInt();
                        cliente = new Cliente(nome, veiculoCliente, horasEstacionado);
                    }

                    if (!gerenciarEstacionamento.adicionarCliente(cliente)) {
                        System.out.println("Todas as vagas estão ocupadas. Não é possível cadastrar novos clientes.");
                    }
                    break;

                case 2: // recibo
                    input.nextLine();
                    System.out.println("Clientes cadastrados: ");
                    gerenciarEstacionamento.exibirClientesCadastrados();

                    System.out.print("Escolha o cliente para exibir o recibo (nome): ");
                    String nomeCliente = input.nextLine();
                    gerenciarEstacionamento.exibirRecibo(nomeCliente);
                    break;

                case 3: // exibir lista de clientes cadastrados
                    gerenciarEstacionamento.exibirClientesCadastrados();
                    break;

                case 4: // exibir vagas restantes
                    System.out.println("Vagas restantes: " + gerenciarEstacionamento.exibirVagasRestantes());
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    input.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente");
                    break;
            }
            System.out.println();
        }
    }
}