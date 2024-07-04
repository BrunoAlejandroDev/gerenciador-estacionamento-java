package Application;

import Entities.*;

import java.util.Locale;
import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        GerenciarEstacionamento gerenciarEstacionamento = new GerenciarEstacionamento();

        while(true) {

            // inserir e verificar o nome e a entrada
            System.out.print("Insira o nome do cliente (ou 'sair' para encerrar): ");
            String nome = input.nextLine();

            if (nome.equalsIgnoreCase("sair")) { // verifica se o usuário digitou sair independente de letras maiusculas ou minusculas
                break;
            }

            // inserir e verificar o tipo de veículo
            System.out.print("Insira o tipo de veículo: ");
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
            gerenciarEstacionamento.adicionarCliente(cliente);
            input.nextLine();
            System.out.println();
        }
        System.out.println();
        gerenciarEstacionamento.exibirRecibo();
    }
}