# Calculadora Inteligente en Java

## Descripcion del Proyecto
Este proyecto es una aplicacion de calculadora por consola escrita en Java. Se creo siguiendo una estructura basica de clases e interfaces. El codigo esta separado en carpetas para organizar las operaciones, el menu y el historial de calculos. La clase principal unicamente inicia el programa llamando al menu.

## Que hace la aplicacion
La aplicacion muestra un menu en la consola con varias opciones numericas del 1 al 14. Mediante una estructura de seleccion se puede elegir la operacion que se desea realizar. Las funciones disponibles son las siguientes:

* Suma de 2 numeros y suma de N numeros.
* Resta de 2 numeros y resta de N numeros.
* Multiplicacion de 2 numeros y multiplicacion de N numeros.
* Division de 2 numeros y division de N numeros.
* Raiz cuadrada de un numero.
* Potencia al cuadrado, potencia al cubo y potencia a la N de un numero.
* Historial que guarda las ultimas 10 operaciones realizadas con su resultado.
* Opcion para salir del programa.

## Estructura de Carpetas
El codigo esta distribuido en el directorio fuente:
* Clases: Contiene los archivos con la logica matematica de cada operacion, el manejo del historial y la logica del menu.
* Interfaces: Contiene las interfaces que implementan las clases de cada operacion.
* Main: Archivo principal ubicado fuera de las carpetas para iniciar la ejecucion.

## Manejo de Errores
El programa incluye validaciones basicas con bloques try-catch:
* Control de formato para evitar que el programa falle si se ingresan letras o espacios en lugar de numeros.
* Control aritmetico para manejar errores como la division entre cero o el calculo de raices cuadradas de numeros negativos.