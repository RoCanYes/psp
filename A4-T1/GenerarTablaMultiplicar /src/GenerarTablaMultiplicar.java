// Importar la biblioteca java.io para trabajar con archivos y flujos de entrada y salida
import java.io.*;

// Definir una nueva clase llamada GenerarTablaMultiplicar
public class GenerarTablaMultiplicar {

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

    // Crear archivos para la entrada, salida y salida de errores
    File archivoEntrada = new File("entrada.txt"); // Archivo de entrada
    File archivoSalida = new File("salida.txt"); // Archivo de salida
    File archivoErrores = new File("errores.txt"); // Archivo de errores

    // Crear un proceso que ejecute la tabla de multiplicar
    ProcessBuilder processBuilder = new ProcessBuilder("java", "TablaMultiplicar", String.valueOf(numero));

    // Redirigir la entrada, salida y salida de errores del proceso a los archivos correspondientes
    processBuilder.redirectInput(archivoEntrada); // Redirigir la entrada a archivoEntrada
    processBuilder.redirectOutput(archivoSalida); // Redirigir la salida a archivoSalida
    processBuilder.redirectError(archivoErrores); // Redirigir la salida de errores a archivoErrores

    // Lanzar el proceso
    try {
      // Lanzar el proceso utilizando el método start del objeto ProcessBuilder
      Process proceso = processBuilder.start();
      // Esperar a que el proceso termine
      proceso.waitFor();
    } catch (IOException | InterruptedException e) {
      // Imprimir un mensaje de error en la salida de errores (stderr) si se produjo un error al lanzar el proceso
      System.err.println("Error al lanzar el proceso.");
    }
  }
}