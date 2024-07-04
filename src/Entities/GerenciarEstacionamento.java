package Entities;

import java.util.ArrayList;
import java.util.List;

public class GerenciarEstacionamento {

    private List<Cliente> listaClientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void exibirRecibo() {
        for (Cliente cliente : listaClientes) {
            cliente.exibirRecibo();
        }
    }

}
