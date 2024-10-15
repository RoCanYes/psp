import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ListarProcesosProcessBuilder {

    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("tasklist");
            
            Process proceso = pb.start();
            
            BufferedReader lector = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea;

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

            lector.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
