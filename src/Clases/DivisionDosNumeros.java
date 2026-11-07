package Clases;

import Interfaces.InterfaceDivisionDosNumeros;

public class DivisionDosNumeros implements InterfaceDivisionDosNumeros {
    @Override
    public double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return dividendo / divisor;
    }
}
