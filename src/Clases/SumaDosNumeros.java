package Clases;

import Interfaces.InterfaceSumaDosNumeros;

public class SumaDosNumeros implements InterfaceSumaDosNumeros {
    @Override
    public double sumar(double primerNumero, double segundoNumero) {
        return primerNumero + segundoNumero;
    }
}
