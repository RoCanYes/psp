// Importar la biblioteca java.io para trabajar con archivos y flujos de entrada y salida
import java.io.*;

// Definir una nueva clase llamada TablaMultiplicar
public class TablaMultiplicar {

  // Definir el método main, que es el punto de entrada del programa
  public static void main(String[] args) {

    // Verificar si se ha proporcionado al menos un argumento en la línea de comandos
    if (args.length < 1) {
      // Imprimir un mensaje de error en la salida de errores (stderr) si no se proporcionó un número
      System.err.println("No se proporcionó un número.");
      // Salir del método main y terminar la ejecución del programa
      return;
    }

    // Intentar leer el primer argumento de la línea de comandos y convertirlo a un número entero
    int numero;
    try {
      // Convertir el primer argumento a un número entero utilizando el método Integer.parseInt
      numero = Integer.parseInt(args[0]);
    } catch (NumberFormatException e) {
      // Imprimir un mensaje de error en la salida de errores (stderr) si el número proporcionado no es válido
      System.err.println("Número no válido: " + args[0]);
      // Salir del método main y terminar la ejecución del programa
      return;
    }

    // Generar la tabla de multiplicar
    for (int i = 1; i <= 10; i++) {
      // Imprimir la tabla de multiplicar
      System.out.println(numero + " x " + i + " = " + (numero * i));
    }
  }
}