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
        if (vagasOcupadas < totalDeVagas) {
            listaClientes.add(cliente);
            ++vagasOcupadas;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean exibirRecibo(String nomeCliente) {

        Cliente clienteParaRemover = null;
        for (Cliente c : getListaClientes()) {
            if (c.getNome().equalsIgnoreCase(nomeCliente.trim())) { // comparação não sensível a letras maiusculas e minusculas e espaços em branco
                c.exibirRecibo();
                clienteParaRemover = c;
                break;
            }
        }

        if (clienteParaRemover != null) {
            removerCliente(clienteParaRemover);
            return true;
        } else {
            return false;
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

    public boolean exibirClientesCadastrados() {
        if (listaClientes.isEmpty()) {
            return false;
        }
        else {
            for (Cliente c : listaClientes) {
                System.out.printf("Nome do cliente: %s | Tipo de veículo: %s%n", c.getNome(), c.getTipoVeiculo().toString());
            }
            return true;
        }
    }
}