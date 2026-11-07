package Clases;

import Interfaces.InterfacePotenciaNumero;

public class PotenciaNumero implements InterfacePotenciaNumero {
    @Override
    public double calcularPotencia(double base, double exponente) {
        return Math.pow(base, exponente); // Usando la función Math de Java
    }
}

