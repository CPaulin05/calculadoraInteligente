package Clases;

import Interfaces.InterfacePotenciaCuadrada;

public class PotenciaCuadrada implements InterfacePotenciaCuadrada {
    @Override
    public double calcularPotenciaCuadrada(double base) {
        return Math.pow(base, 2); // Usando la función Math de Java
    }
}
