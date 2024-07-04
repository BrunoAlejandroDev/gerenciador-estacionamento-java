package Entities;

public class Cliente {

    // VARIAVEIS
    private int quantHorasMinimas = 2;

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
    public double calcularTaxa() {
        return tipoVeiculo.calcularTaxa(quantidade, porDias);
    }


    public void exibirRecibo() {

        double taxa = calcularTaxa();

        System.out.println("====== Recibo do cliente " + getNome() + " ======");
        System.out.println("Tipo de veículo: " + tipoVeiculo.getTipoVeiculo());

        if (porDias) {
            System.out.println("Quantidade de dias estacionados: " + quantidade);
            System.out.println(Carro.getTaxa_diaria());
            System.out.println(Carro.getAdicional_seguranca());
            System.out.printf("Valor total: %.2f%n", taxa);
        }
        else {
            System.out.println("Quantidade de horas estacionadas: " + quantidade);
            String veiculo = tipoVeiculo instanceof Carro ? "Taxa mínima: R$5.00" : "Taxa mínima: 3:00";
            System.out.println(veiculo + " (até 2 horas de permanência)");
            System.out.println("Horas extras: " + (quantidade - quantHorasMinimas) + " horas");

            if (quantidade > 2) {
                System.out.printf("Acréscimo por horas extra: R$%.2f " +
                        "(%.2f cada)%n", taxa - (tipoVeiculo instanceof Carro ? 5.0 : 3.0), Carro.getTaxa_adicional_horas());
            }
            System.out.printf("Valor total: R$%.2f%n", taxa);
        }
        System.out.println();
    }
}