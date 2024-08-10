package Entities;

public abstract class Veiculo {

    // ATRIBUTOS
    protected String tipoVeiculo;

    // CONSTRUTOR
    public Veiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    // GETTER
//    public String getTipoVeiculo() {
//        return tipoVeiculo;
//    }

    // METODOS PUBLICOS
    public abstract double calcularTaxa(int tempoPercorrido, boolean porDias);

    public abstract void exibirRecibo(int quantidade, boolean porDias);

    @Override
    public String toString() {
        return tipoVeiculo;
    }
}