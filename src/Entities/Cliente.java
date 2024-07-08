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
    public double calcularTaxa() {
        return tipoVeiculo.calcularTaxa(quantidade, porDias);
    }

    // VARIAVEIS
    private int quantHorasMinimas = 2;
    public void exibirRecibo() {

        System.out.println();
        double taxa = calcularTaxa();
        System.out.println("====== Recibo do cliente " + getNome() + " ======");
        System.out.println("Tipo de veículo: " + tipoVeiculo.getTipoVeiculo());

        if (porDias) {
            System.out.println("Quantidade de dias estacionados: " + quantidade);
            System.out.println("Taxa diária: R$" + Carro.getTaxaDiaria());
            System.out.println("Taxa de segurança: R$" + Carro.getAdicionalSeguranca());
            System.out.printf("Valor total: R$ %.2f%n", taxa);
        }
        else {
            System.out.println("Quantidade de horas estacionadas: " + quantidade);
            String veiculo;
            if (tipoVeiculo instanceof Carro) {
                veiculo = "Taxa mínima: R$" + Carro.getTaxaMinimaHoras();
            }
            else {
                veiculo = "Taxa mínima: R$" + Moto.getTaxaMinima();
            }
            System.out.println(veiculo + " (até 2 horas de permanência)");
            System.out.println("Horas extras: " + (quantidade - quantHorasMinimas) + " horas");

            if (quantidade > 2) {
                System.out.printf("Acréscimo por horas extra: R$%.2f " +
                        "(%.2f cada)%n", taxa - (tipoVeiculo instanceof Carro ? 5.0 : 3.0), Carro.getTaxaAdicionalHoras());
            }
            System.out.printf("Valor total: R$%.2f%n", taxa);
        }
        System.out.println();
    }
}