package Entities;

import java.util.ArrayList;
import java.util.List;

public class GerenciarEstacionamento {

    // VARIÁVEIS E ATRIBUTOS
    private List<Cliente> listaClientes = new ArrayList<>();
    private int totalDeVagas = 3;
    private int vagasOcupadas = 0;

    // GETTERS
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    // METODOS PUBLICOS
    public boolean adicionarCliente(Cliente cliente) {
        if (vagasOcupadas <= totalDeVagas) {
            listaClientes.add(cliente);
            vagasOcupadas++;
            return true;
        }
        else {
            System.out.println("Todas as vagas estão ocupadas. Não é possível cadastrar novos clientes.");
            return false;
        }
    }

    public void exibirRecibo(String nomeCliente) {

        Cliente clienteParaRemover = null;
        for (Cliente c : getListaClientes()) {
            if (c.getNome().equals(nomeCliente)) {
                c.exibirRecibo();
                clienteParaRemover = c;
                break;
            }
        }

        if (clienteParaRemover != null) {
            removerCliente(clienteParaRemover);
        } else {
            System.out.println("Cliente não encontrado.");
        }

    }

    public void removerCliente(Cliente cliente) {
        if (listaClientes.remove(cliente)) {
            vagasOcupadas--;
        }
    }

    public int exibirVagasRestantes() {
        return totalDeVagas - vagasOcupadas;
    }

    public void exibirClientesCadastrados() {
        if (listaClientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        }
        else {
            for (Cliente c : listaClientes) {
                System.out.printf("Nome do cliente: %s%nTipo de veículo: %s%n", c.getNome(), c.getTipoVeiculo().toString());
            }
        }
    }
}