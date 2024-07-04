package Application;

import Entities.Carro;
import Entities.Moto;

public class Estacionamento {
    public static void main(String[] args) {

        // teste das classes carro e moto
        Carro carro1 = new Carro();
        System.out.println(carro1.calcularTaxa(5, false));

        Moto moto1 = new Moto();
        System.out.println(moto1.calcularTaxa(2, true));
        
    }
}
