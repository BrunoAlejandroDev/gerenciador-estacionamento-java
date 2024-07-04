package Entities;

public abstract class Veiculo {

    // ATRIBUTOS
    private String tipoVeiculo;

    // CONSTRUTOR
    public Veiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    // GETTER
    public String getTipoVeiculo(){
        return tipoVeiculo;
    }

    // METODOS PUBLICOS
    public abstract double calcularTaxa(int tempoPercorrido, boolean porDias);
}