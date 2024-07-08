package Entities;

public class Carro extends Veiculo {

    // ATRIBUTOS
    protected static double taxaMinimaHoras = 5.0;
    protected static double taxaAdicionalHoras = 0.50;
    protected static double taxaDiaria = 20.0;
    protected static double adicionalSeguranca = 3.0;

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
            return taxaDiaria * tempoPercorrido + adicional_seguranca; // retorno caso o veículo fique um dia ou mais no estacionamento
        }
        else { // retorno caso o veículo fique apenas algumas horas
            double taxa = taxaMinimaHoras;
            if (tempoPercorrido > 2) {
                taxa += taxaAdicionalHoras * (tempoPercorrido - 2);
            }
            return taxa;
        }
    }

    public String toString() {
        return super.toString();
    }
}
