package Entities;

public class Moto extends Veiculo {

    // ATRIBUTOS
    private static final double TAXA_MINIMA = 3.0;
    private static final double TAXA_ADICIONAL_HORAS = 0.5;
    private static final double TAXA_DIARIA = 15.0;
    private static final double ADICIONAL_SEGURANCA = 3.0;

    // CONSTRUTOR
    public Moto() {
        super("Moto");
    }

    // METODOS PUBLICOS
    @Override
    public double calcularTaxa(int tempoPercorrido, boolean porDias) {
        if (porDias) {
            return TAXA_DIARIA * tempoPercorrido + ADICIONAL_SEGURANCA;
        }
        else {
            double taxa = TAXA_MINIMA;
            if (tempoPercorrido > 2) {
                taxa += TAXA_ADICIONAL_HORAS * (tempoPercorrido - 2);
            }
            return taxa;
        }
    }

    public String toString() {
        return super.toString();
    }
}
