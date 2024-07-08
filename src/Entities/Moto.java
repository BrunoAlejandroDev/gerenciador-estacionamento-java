package Entities;

public class Moto extends Veiculo {

    // ATRIBUTOS
    protected static double taxaMinima = 3.0;
    protected static double taxaAdicionalHoras = 0.5;
    protected static double taxaDiaria = 15.0;
    protected static double adicionalSeguranca = 3.0;

    // CONSTRUTOR
    public Moto() {
        super("Moto");
    }

    // GETTERS
    public static double getTaxaMinima() {
        return taxaMinima;
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
            return taxaDiaria * tempoPercorrido + adicionalSeguranca;
        }
        else {
            double taxa = taxaMinima;
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
