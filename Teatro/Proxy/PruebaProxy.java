package Teatro.Proxy;

import EntradasSalidas.SalidaConsola;

public class PruebaProxy{
    static final SalidaConsola salida = new SalidaConsola();
    public static void main(String[] args) {
        Boleteria online = new BoleteriaOnline();
        Boleto funcionUno = online.entregarBoleta("Gran Opera de 100 horas", "26/09/2187");
        Boleto funcionDos = online.entregarBoleta("Octavario", "14/02/2188");

        Boleto funcionTres = online.entregarBoleta("Octavario", "99/99/9999");

        salida.enviar(funcionUno);
        salida.enviar(funcionDos);
        salida.enviar(funcionTres);
    }
}