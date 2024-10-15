class TablaMultiplicarThread extends Thread {
    private int numero;

    public TablaMultiplicarThread(int numero) {
        this.numero = numero;
    }

    
    public void run() {
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

public class Main {
    public static void main(String[] args) {
        // Números para los que se calculará la tabla de multiplicar
        int[] numeros = {2, 3, 4};

        // Lanzar hilos simultáneos
        for (int numero : numeros) {
            // Crear un nuevo hilo para cada número
            TablaMultiplicarThread thread = new TablaMultiplicarThread(numero);
            thread.start();
        }
    }
}