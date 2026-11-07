package Clases;

import Interfaces.InterfaceMultiplicacionNumeros;

public class MultiplicacionNumeros implements InterfaceMultiplicacionNumeros {
    @Override
    public double multiplicar(double... numeros) {
        if (numeros.length == 0) return 0;
        double total = 1;
        for (double numero : numeros) {
            total *= numero;
        }
        return total;
    }
}
