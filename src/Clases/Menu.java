package Clases;

import Interfaces.*;
import java.util.Scanner;

public class Menu implements InterfaceMenu {
    private final HistorialServicio historialServicio = new HistorialServicio();

    @Override
    public void mostrarMenu() {
        Scanner lector = new Scanner(System.in);
        int opcionSeleccionada = 0;

        do {
            System.out.println("\n=== CALCULADORA INTELIGENTE ===");
            System.out.println("1. Suma de 2 números");
            System.out.println("2. Suma de N números");
            System.out.println("3. Resta de 2 números");
            System.out.println("4. Resta de N números");
            System.out.println("5. Multiplicación de 2 números");
            System.out.println("6. Multiplicación de N números");
            System.out.println("7. División de 2 números");
            System.out.println("8. División de N números");
            System.out.println("9. Raíz cuadrada");
            System.out.println("10. Potencia al cuadrado");
            System.out.println("11. Potencia al cubo");
            System.out.println("12. Potencia a la N número");
            System.out.println("13. Ver Historial de operaciones");
            System.out.println("14. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcionSeleccionada = Integer.parseInt(lector.nextLine());

                switch (opcionSeleccionada) {
                    case 1:
                        System.out.print("Ingresa el primer número: ");
                        double num1 = Double.parseDouble(lector.nextLine());
                        System.out.print("Ingresa el segundo número: ");
                        double num2 = Double.parseDouble(lector.nextLine());

                        InterfaceSumaDosNumeros operacionSumaDos = new SumaDosNumeros();
                        double resultadoSumaDos = operacionSumaDos.sumar(num1, num2);
                        System.out.println("Resultado: " + resultadoSumaDos);
                        historialServicio.agregarOperacion(num1 + " + " + num2 + " = " + resultadoSumaDos);
                        break;

                    case 2:
                        System.out.print("¿Cuántos números deseas sumar?: ");
                        int cantidadSumaN = Integer.parseInt(lector.nextLine());
                        double[] numerosSumaN = new double[cantidadSumaN];
                        StringBuilder descSumaN = new StringBuilder();
                        for (int i = 0; i < cantidadSumaN; i++) {
                            System.out.print("Ingresa el número " + (i + 1) + ": ");
                            numerosSumaN[i] = Double.parseDouble(lector.nextLine());
                            descSumaN.append(numerosSumaN[i]);
                            if (i < cantidadSumaN - 1) descSumaN.append(" + ");
                        }
                        InterfaceSumaNumeros operacionSumaN = new SumaNumeros();
                        double resultadoSumaN = operacionSumaN.sumar(numerosSumaN);
                        System.out.println("Resultado: " + resultadoSumaN);
                        historialServicio.agregarOperacion(descSumaN + " = " + resultadoSumaN);
                        break;

                    case 3:
                        System.out.print("Ingresa el primer número: ");
                        double resta1 = Double.parseDouble(lector.nextLine());
                        System.out.print("Ingresa el segundo número: ");
                        double resta2 = Double.parseDouble(lector.nextLine());

                        InterfaceRestaDosNumeros operacionRestaDos = new RestaDosNumeros();
                        double resultadoRestaDos = operacionRestaDos.restar(resta1, resta2);
                        System.out.println("Resultado: " + resultadoRestaDos);
                        historialServicio.agregarOperacion(resta1 + " - " + resta2 + " = " + resultadoRestaDos);
                        break;

                    case 4:
                        System.out.print("¿Cuántos números deseas restar?: ");
                        int cantidadRestaN = Integer.parseInt(lector.nextLine());
                        double[] numerosRestaN = new double[cantidadRestaN];
                        StringBuilder descRestaN = new StringBuilder();
                        for (int i = 0; i < cantidadRestaN; i++) {
                            System.out.print("Ingresa el número " + (i + 1) + ": ");
                            numerosRestaN[i] = Double.parseDouble(lector.nextLine());
                            descRestaN.append(numerosRestaN[i]);
                            if (i < cantidadRestaN - 1) descRestaN.append(" - ");
                        }
                        InterfaceRestaNumeros operacionRestaN = new RestaNumeros();
                        double resultadoRestaN = operacionRestaN.restar(numerosRestaN);
                        System.out.println("Resultado: " + resultadoRestaN);
                        historialServicio.agregarOperacion(descRestaN + " = " + resultadoRestaN);
                        break;

                    case 5:
                        System.out.print("Ingresa el primer número: ");
                        double mult1 = Double.parseDouble(lector.nextLine());
                        System.out.print("Ingresa el segundo número: ");
                        double mult2 = Double.parseDouble(lector.nextLine());

                        InterfaceMultiplicacionDosNumeros operacionMultDos = new MultiplicacionDosNumeros();
                        double resultadoMultDos = operacionMultDos.multiplicar(mult1, mult2);
                        System.out.println("Resultado: " + resultadoMultDos);
                        historialServicio.agregarOperacion(mult1 + " * " + mult2 + " = " + resultadoMultDos);
                        break;

                    case 6:
                        System.out.print("¿Cuántos números deseas multiplicar?: ");
                        int cantidadMultN = Integer.parseInt(lector.nextLine());
                        double[] numerosMultN = new double[cantidadMultN];
                        StringBuilder descMultN = new StringBuilder();
                        for (int i = 0; i < cantidadMultN; i++) {
                            System.out.print("Ingresa el número " + (i + 1) + ": ");
                            numerosMultN[i] = Double.parseDouble(lector.nextLine());
                            descMultN.append(numerosMultN[i]);
                            if (i < cantidadMultN - 1) descMultN.append(" * ");
                        }
                        InterfaceMultiplicacionNumeros operacionMultN = new MultiplicacionNumeros();
                        double resultadoMultN = operacionMultN.multiplicar(numerosMultN);
                        System.out.println("Resultado: " + resultadoMultN);
                        historialServicio.agregarOperacion(descMultN + " = " + resultadoMultN);
                        break;

                    case 7:
                        System.out.print("Ingresa el dividendo: ");
                        double dividendo = Double.parseDouble(lector.nextLine());
                        System.out.print("Ingresa el divisor: ");
                        double divisor = Double.parseDouble(lector.nextLine());

                        InterfaceDivisionDosNumeros operacionDivisionDos = new DivisionDosNumeros();
                        double resultadoDivisionDos = operacionDivisionDos.dividir(dividendo, divisor);
                        System.out.println("Resultado: " + resultadoDivisionDos);
                        historialServicio.agregarOperacion(dividendo + " / " + divisor + " = " + resultadoDivisionDos);
                        break;

                    case 8:
                        System.out.print("¿Cuántos números deseas dividir en cadena?: ");
                        int cantidadDivN = Integer.parseInt(lector.nextLine());
                        double[] numerosDivN = new double[cantidadDivN];
                        StringBuilder descDivN = new StringBuilder();
                        for (int i = 0; i < cantidadDivN; i++) {
                            System.out.print("Ingresa el número " + (i + 1) + ": ");
                            numerosDivN[i] = Double.parseDouble(lector.nextLine());
                            descDivN.append(numerosDivN[i]);
                            if (i < cantidadDivN - 1) descDivN.append(" / ");
                        }
                        InterfaceDivisionNumeros operacionDivisionN = new DivisionNumeros();
                        double resultadoDivisionN = operacionDivisionN.dividir(numerosDivN);
                        System.out.println("Resultado: " + resultadoDivisionN);
                        historialServicio.agregarOperacion(descDivN + " = " + resultadoDivisionN);
                        break;

                    case 9:
                        System.out.print("Ingresa el número: ");
                        double numeroRaiz = Double.parseDouble(lector.nextLine());

                        InterfaceRaizCuadrada operacionRaiz = new RaizCuadrada();
                        double resultadoRaiz = operacionRaiz.calcularRaizCuadrada(numeroRaiz);
                        System.out.println("Resultado: " + resultadoRaiz);
                        historialServicio.agregarOperacion("Raíz cuadrada de " + numeroRaiz + " = " + resultadoRaiz);
                        break;

                    case 10:
                        System.out.print("Ingresa la base: ");
                        double baseCuadrada = Double.parseDouble(lector.nextLine());

                        InterfacePotenciaCuadrada operacionPotCuadrada = new PotenciaCuadrada();
                        double resultadoPotCuadrada = operacionPotCuadrada.calcularPotenciaCuadrada(baseCuadrada);
                        System.out.println("Resultado: " + resultadoPotCuadrada);
                        historialServicio.agregarOperacion(baseCuadrada + " al cuadrado = " + resultadoPotCuadrada);
                        break;

                    case 11:
                        System.out.print("Ingresa la base: ");
                        double baseCubo = Double.parseDouble(lector.nextLine());

                        InterfacePotenciaCubo operacionPotCubo = new PotenciaCubo();
                        double resultadoPotCubo = operacionPotCubo.calcularPotenciaCubo(baseCubo);
                        System.out.println("Resultado: " + resultadoPotCubo);
                        historialServicio.agregarOperacion(baseCubo + " al cubo = " + resultadoPotCubo);
                        break;

                    case 12:
                        System.out.print("Ingresa la base: ");
                        double baseN = Double.parseDouble(lector.nextLine());
                        System.out.print("Ingresa el exponente: ");
                        double exponenteN = Double.parseDouble(lector.nextLine());

                        InterfacePotenciaNumero operacionPotN = new PotenciaNumero();
                        double resultadoPotN = operacionPotN.calcularPotencia(baseN, exponenteN);
                        System.out.println("Resultado: " + resultadoPotN);
                        historialServicio.agregarOperacion(baseN + " elevado a la " + exponenteN + " = " + resultadoPotN);
                        break;

                    case 13:
                        historialServicio.mostrarHistorial();
                        break;

                    case 14:
                        System.out.println("¡Gracias por usar la calculadora, hasta luego!");
                        break;

                    default:
                        System.out.println("⚠️ Opción no válida. Por favor, elige un número del 1 al 14.");
                }

            } catch (NumberFormatException excepcionFormato) {
                // Try-Catch 1: Maneja si escriben letras en lugar de números
                System.out.println("⚠️ Error: Debes ingresar un valor numérico válido.");
                opcionSeleccionada = 0;
            } catch (ArithmeticException | IllegalArgumentException excepcionMatematica) {
                // Try-Catch 2: Maneja errores matemáticos (división entre cero, raíces negativas, etc.)
                System.out.println("⚠️ Error matemático: " + excepcionMatematica.getMessage());
            }

        } while (opcionSeleccionada != 14);

        lector.close();
    }
}