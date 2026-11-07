package Clases;

import Interfaces.InterfaceRestaNumeros;

public class RestaNumeros implements InterfaceRestaNumeros {
    @Override
    public double restar(double... numeros) {
        if (numeros.length == 0) return 0;
        double total = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            total -= numeros[i];
        }
        return total;
    }
}
