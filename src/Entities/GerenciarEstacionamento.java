package Entities;

import java.util.ArrayList;
import java.util.List;

public class GerenciarEstacionamento {

    // VARIÁVEIS E ATRIBUTOS
    private List<Cliente> listaClientes = new ArrayList<>();
    private int totalDeVagas = 5;
    private int vagasOcupadas = 0;

    // GETTERS
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    // METODOS PUBLICOS
    public boolean adicionarCliente(Cliente cliente) {
        if (vagasOcupadas < totalDeVagas) {
            listaClientes.add(cliente);
            vagasOcupadas++;
            return true;
        }
        else {
            System.out.println("Todas as vagas estão ocupadas. Não é possível cadastrar novos clientes.");
            return false;
        }
    }

    public void removerCliente(Cliente cliente) {
        if (listaClientes.remove(cliente)) {
            vagasOcupadas--;
        }
    }

    public void exibirRecibo() {
        for (Cliente cliente : listaClientes) {
            cliente.exibirRecibo();
        }
    }

    public int exibirVagasRestantes() {
        return totalDeVagas - vagasOcupadas;
    }
}