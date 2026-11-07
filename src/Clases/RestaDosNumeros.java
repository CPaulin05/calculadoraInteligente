package Clases;

import Interfaces.InterfaceRestaDosNumeros;

public class RestaDosNumeros implements InterfaceRestaDosNumeros {
    @Override
    public double restar(double primerNumero, double segundoNumero) {
        return primerNumero - segundoNumero;
    }
}
