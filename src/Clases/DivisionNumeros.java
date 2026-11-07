package Clases;

import Interfaces.InterfaceDivisionNumeros;

public class DivisionNumeros implements InterfaceDivisionNumeros {
    @Override
    public double dividir(double... numeros) {
        if (numeros.length == 0) return 0;
        double total = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                throw new ArithmeticException("No se puede dividir entre cero.");
            }
            total /= numeros[i];
        }
        return total;
    }
}
