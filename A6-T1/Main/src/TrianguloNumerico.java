import java.io.*;

// Esta clase se llama TrianguloNumerico y se utiliza para generar triángulos numéricos
public class TrianguloNumerico {
    // Este es el método main, que es el punto de entrada de la aplicación
    public static void main(String[] args) throws IOException, InterruptedException {
        // Definimos un arreglo de enteros que contiene las bases de los triángulos que queremos generar
        int[] bases = {5, 6, 7};

        // Lanzamos un proceso para cada base en el arreglo
        for (int base : bases) {
            // Creamos un objeto ProcessBuilder que se utiliza para lanzar un nuevo proceso
            ProcessBuilder pb = new ProcessBuilder("java", "TrianguloNumerico", String.valueOf(base));
            
            // Creamos un objeto File que representa el archivo de salida para el triángulo
            File outputFile = new File("triangulo_" + base + ".txt");
            
            // Configuramos el objeto ProcessBuilder para que redirija la salida del proceso al archivo de salida
            pb.redirectOutput(ProcessBuilder.Redirect.appendTo(outputFile));
            
            // Lanzamos el proceso
            Process p = pb.start();
        }

        // Si se proporcionan argumentos en la línea de comandos, los procesamos
        if (args.length > 0) {
            // Convertimos el primer argumento a un entero, que representa la base del triángulo
            int base = Integer.parseInt(args[0]);
            
            // Llamamos al método generarTriangulo para generar el triángulo correspondiente
            generarTriangulo(base);
        }
    }

    // Este método se utiliza para generar un triángulo numérico con una base determinada
    public static void generarTriangulo(int base) {
        // Creamos un objeto PrintWriter que se utiliza para escribir en el archivo de salida
        try (PrintWriter writer = new PrintWriter("triangulo_" + base + ".txt")) {
            // Generamos el triángulo numérico
            for (int i = base; i > 0; i--) {
                // En cada iteración, escribimos una fila del triángulo
                for (int j = 1; j <= i; j++) {
                    // Escribimos el número correspondiente en la fila
                    writer.print(j);
                }
                // Después de escribir la fila, escribimos un salto de línea
                writer.println();
            }
        } catch (FileNotFoundException e) {
            // Si ocurre un error al abrir el archivo de salida, lo imprimimos
            e.printStackTrace();
        }
    }
}