import java.io.IOException;

public class LanzarProceso2 {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder("calc.exe");

        try {
            processBuilder.start();
            System.out.println("Calculadora lanzada.");
        } catch (IOException e) {
            System.err.println("Error al intentar lanzar la calculadora.");
            e.printStackTrace();
        }
    }
}
