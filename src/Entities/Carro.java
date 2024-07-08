package Entities;

public class Carro extends Veiculo {

    // ATRIBUTOS
    protected static double taxa_minima_horas = 5.0;
    protected static double taxa_adicional_horas = 0.50;
    protected static double taxa_diaria = 20.0;
    protected static double adicional_seguranca = 3.0;

    // CONSTRUTOR
    public Carro() {
        super("Carro");
    }

    // GETTERS
    public static double getTaxa_minima_horas() {
        return taxa_minima_horas;
    }

    public static double getTaxa_adicional_horas() {
        return taxa_adicional_horas;
    }

    public static double getTaxa_diaria() {
        return taxa_diaria;
    }

    public static double getAdicional_seguranca() {
        return adicional_seguranca;
    }

    // METODOS PUBLICOS
    @Override
    public double calcularTaxa(int tempoPercorrido, boolean porDias) {
        if (porDias) {
            return taxa_diaria * tempoPercorrido + adicional_seguranca; // retorno caso o veículo fique um dia ou mais no estacionamento
        }
        else { // retorno caso o veículo fique apenas algumas horas
            double taxa = taxa_minima_horas;
            if (tempoPercorrido > 2) {
                taxa += taxa_adicional_horas * (tempoPercorrido - 2);
            }
            return taxa;
        }
    }

    public String toString() {
        return super.toString();
    }
}
