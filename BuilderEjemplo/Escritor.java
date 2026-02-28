package BuilderEjemplo;
import java.io.FileWriter; 
import java.io.IOException; 
public class Escritor{
    FileWriter escritor;
    public Escritor(String nombreArchivo){
        try{
            this.escritor = new FileWriter(nombreArchivo, true);
        }
        catch(IOException e){
            System.err.println("Error: "+e);
        }
    }

    public void escribir(String m){
        try {
            escritor.write(m+"\n");
            escritor.close();
        } 
        catch (IOException e) {
            System.err.println("Error: "+e);
        }
    }
}