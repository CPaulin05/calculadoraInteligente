package Clases;

import Interfaces.InterfaceSumaNumeros;

public class SumaNumeros implements InterfaceSumaNumeros {
    @Override
    public double sumar(double... numeros) {
        double total = 0;
        for (double numero : numeros) {
            total += numero;
        }
        return total;
    }
}
