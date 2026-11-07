package Clases;

import Interfaces.InterfacePotenciaCubo;

public class PotenciaCubo implements InterfacePotenciaCubo {
    @Override
    public double calcularPotenciaCubo(double base) {
        return Math.pow(base, 3); // Usando la función Math de Java
    }
}
