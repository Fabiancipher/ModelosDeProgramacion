package Chain;
import EntradasSalidas.SalidaConsola;
public class PruebaChain{
    private static final SalidaConsola salida = new SalidaConsola();
    public static void main(String[] args) {
        Silla sillaBasica = new Silla(10, "Basica");
        Silla sillaPreferencial = new Silla(5, "Preferencial");
        Silla sillaVIP = new Silla(20, "VIP");
        Silla sillaPremium = new Silla(50, "Premium");

        sillaBasica.setNext(sillaPreferencial);
        sillaPreferencial.setNext(sillaVIP);
        sillaVIP.setNext(sillaPremium);

        salida.enviar(sillaBasica.handle(50));
        salida.enviar(sillaBasica.handle(100));
        salida.enviar(sillaBasica.handle("PREFERENCIAL"));
        salida.enviar(sillaBasica.handle("Otro"));
    }
}