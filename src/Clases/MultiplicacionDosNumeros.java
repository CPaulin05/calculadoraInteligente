package Clases;

import Interfaces.InterfaceMultiplicacionDosNumeros;

public class MultiplicacionDosNumeros implements InterfaceMultiplicacionDosNumeros {
    @Override
    public double multiplicar(double primerNumero, double segundoNumero) {
        return primerNumero * segundoNumero;
    }
}
