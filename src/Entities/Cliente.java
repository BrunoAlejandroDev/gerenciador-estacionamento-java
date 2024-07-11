package Entities;

public class Cliente {

    // ATRIBUTOS
    private String nome;
    private Veiculo tipoVeiculo;
    private int quantidade;
    private boolean porDias;

    // CONSTRUTOR - HORAS
    public Cliente(String nome, Veiculo tipoVeiculo, int quantidadeHoras) {
        this.nome = nome;
        this.tipoVeiculo = tipoVeiculo;
        this.quantidade = quantidadeHoras;
        this.porDias = false;
    }
    // CONSTRUTOR - DIAS
    public Cliente(String nome, Veiculo tipoVeiculo, int dias, boolean porDias) {
        this.nome = nome;
        this.tipoVeiculo = tipoVeiculo;
        this.quantidade = dias;
        this.porDias = porDias;
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public Veiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean getPorDias() {
        return porDias;
    }

    // METODOS PUBLICOS
//    public double calcularTaxa() {
//        return tipoVeiculo.calcularTaxa(quantidade, porDias);
//    }

    public void exibirRecibo() {
        tipoVeiculo.exibirRecibo(quantidade, porDias);
    }
}