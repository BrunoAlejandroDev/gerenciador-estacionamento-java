package Entities;

public class Carro extends Veiculo {

    // ATRIBUTOS
    private static double taxaMinimaHoras = 5.00;
    private static double taxaAdicionalHoras = 0.50;
    private static double taxaDiaria = 20.0;
    private static double adicionalSeguranca = 3.00;

    // CONSTRUTOR
    public Carro() {
        super("Carro");
    }

    // GETTERS
    public static double getTaxaMinimaHoras() {
        return taxaMinimaHoras;
    }

    public static double getTaxaAdicionalHoras() {
        return taxaAdicionalHoras;
    }

    public static double getTaxaDiaria() {
        return taxaDiaria;
    }

    public static double getAdicionalSeguranca() {
        return adicionalSeguranca;
    }

    // METODOS PUBLICOS
    @Override
    public double calcularTaxa(int tempoPercorrido, boolean porDias) {
        if (porDias) {
            return taxaDiaria * tempoPercorrido + adicionalSeguranca; // retorno caso o veículo fique um dia ou mais no estacionamento
        }
        else { // retorno caso o veículo fique apenas algumas horas
            double taxa = taxaMinimaHoras;
            if (tempoPercorrido > 2) {
                taxa += taxaAdicionalHoras * (tempoPercorrido - 2);
            }
            return taxa;
        }
    }

    private int quantHorasMinimas = 2;
    @Override
    public void exibirRecibo(int quantidade, boolean porDias) {

        if (porDias) {
            System.out.println("Quantidade de dias estacionados: " + quantidade);
            System.out.println("Taxa diária: R$" + getTaxaDiaria());
            System.out.println("Taxa de segurança: R$" + getAdicionalSeguranca());
            System.out.printf("VALOR TOTAL: R$ %.2f%n", calcularTaxa(quantidade, porDias));
        }
        else {
            System.out.println("Quantidade de horas estacionadas: " + quantidade + " hora(s)");
            System.out.printf("Taxa mínima: %.2f (até 2 horas de permanência)%n", getTaxaMinimaHoras());

            if (quantidade > 2) {
                System.out.println("Horas extras: " + (quantidade - quantHorasMinimas) + " hora(s)");
                System.out.printf("Acréscimo por horas extra: R$%.2f " +
                        "(cada)%n", calcularTaxa(quantidade, porDias) - getTaxaMinimaHoras());
            }
            System.out.printf("VALOR TOTAL: R$%.2f%n", calcularTaxa(quantidade, porDias));
        }

    }

    public String toString() {
        return super.toString();
    }
}