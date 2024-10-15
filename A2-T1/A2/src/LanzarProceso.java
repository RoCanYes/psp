import java.io.IOException;

public class LanzarProceso {
    public static void main(String[] args) {
        try {

            Runtime.getRuntime().exec("calc.exe");
            System.out.println("Calculadora lanzada.");

        } catch (IOException e) {
            
            System.err.println("Error al intentar lanzar la calculadora.");
            e.printStackTrace();
        }
    }
}
