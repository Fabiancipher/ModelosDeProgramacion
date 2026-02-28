package Builder;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lector{

    BufferedReader lector;
    StringBuilder sb = new StringBuilder();

    public Lector(String nombreArchivo){
        try {
            this.lector = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(nombreArchivo))));

        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e);
        }
    }

    public String leer(){
        String linea;
        try {
            while ((linea = this.lector.readLine())!=null) {
                 this.sb.append(linea).append("\n");

            }
        } catch (IOException e) {
            System.err.println(e);
        }

        return this.sb.toString();
    }
}