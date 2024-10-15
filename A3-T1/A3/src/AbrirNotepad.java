import java.io.File;

public class AbrirNotepad {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Por favor, proporciona el nombre del archivo de texto a abrir.");
            return;
        }
        String nombreArchivo = args[0];

        ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe", nombreArchivo);
        // processBuilder.directory(new File("ruta/del/directorio"));

        try {
            Process proceso = processBuilder.start();
            System.out.println("Abriendo " + nombreArchivo + " en Notepad...");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se pudo abrir Notepad con el archivo: " + nombreArchivo);
        }
    }
}
