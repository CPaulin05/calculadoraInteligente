package Clases;

import Interfaces.InterfaceHistorial;
import java.util.ArrayList;
import java.util.List;

public class HistorialServicio implements InterfaceHistorial {
    private final List<String> listaHistorial = new ArrayList<>();
    private static final int LIMITE_HISTORIAL = 10;

    @Override
    public void agregarOperacion(String descripcionOperacion) {
        if (listaHistorial.size() >= LIMITE_HISTORIAL) {
            listaHistorial.remove(0); // Saca la más antigua si llega a 10
        }
        listaHistorial.add(descripcionOperacion);
    }

    @Override
    public void mostrarHistorial() {
        System.out.println("\n--- HISTORIAL DE OPERACIONES (Últimas 10) ---");
        if (listaHistorial.isEmpty()) {
            System.out.println("No hay operaciones registradas todavía.");
        } else {
            for (int indice = 0; indice < listaHistorial.size(); indice++) {
                System.out.println((indice + 1) + ". " + listaHistorial.get(indice));
            }
        }
        System.out.println("----------------------------------------------\n");
    }
}
