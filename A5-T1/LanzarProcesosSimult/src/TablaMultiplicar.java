import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TablaMultiplicar {
    public static void main(String[] args) throws IOException {
        // Números para los que se calculará la tabla de multiplicar
        int[] numeros = {2, 3, 4};

        // Lanzar procesos simultáneos
        for (int numero : numeros) {
            // Crear un nuevo proceso para cada número
            ProcessBuilder pb = new ProcessBuilder("java", "TablaMultiplicar", String.valueOf(numero));
            Process p = pb.start();

            // Leer la salida del proceso
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea;
            while ((linea = reader.readLine()) != null) {
                // Imprimir la salida del proceso en la consola
                System.out.println(linea);
            }
        }
    }

    // Método para calcular la tabla de multiplicar
    public static void calcularTabla(int numero) {
        // Imprimir el título de la tabla de multiplicar
        System.out.println("Tabla de multiplicar del " + numero + ":");

        // Calcular y imprimir la tabla de multiplicar
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Imprimir la hora del sistema
        System.out.println("Hora del sistema: " + new java.util.Date());
    }
}