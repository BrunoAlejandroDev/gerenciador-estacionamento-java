package Entities;

public class Carro extends Veiculo {

    // ATRIBUTOS
    private static final double TAXA_MINIMA_HORAS = 5.0;
    private static final double TAXA_ADICIONAL_HORAS = 0.50;
    private static final double TAXA_DIARIA = 20.0;
    private static final double ADICONAL_SEGURANCA = 3.0;

    public Carro() {
        super("Carro");
    }

    @Override
    public double calcularTaxa(int tempoPercorrido, boolean porDias) {
        if (porDias) {
            return TAXA_DIARIA * tempoPercorrido + ADICONAL_SEGURANCA; // retorno caso o veículo fique um dia ou mais no estacionamento
        }
        else { // retorno caso o veículo fique apenas algumas horas
            double taxa = TAXA_MINIMA_HORAS;
            if (tempoPercorrido > 2) {
                taxa += TAXA_ADICIONAL_HORAS * (tempoPercorrido - 2);
            }
            return taxa;
        }
    }
}
