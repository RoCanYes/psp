import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LanzarProceso {

    public static void main(String[] args) {
        try {
            Process proceso = Runtime.getRuntime().exec("tasklist");

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
