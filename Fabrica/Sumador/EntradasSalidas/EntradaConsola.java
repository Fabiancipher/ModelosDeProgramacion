package EntradasSalidas;
import java.util.Scanner;
public class EntradaConsola implements Entrada{
    static Scanner sc = new Scanner(System.in);

    public EntradaConsola() {

    }

    /**
     * Captura la entrada de datos a través de la consola.
      * @return La entrada capturada.
     */
    @Override
    public String capturar() {
        return sc.nextLine();
    }

}