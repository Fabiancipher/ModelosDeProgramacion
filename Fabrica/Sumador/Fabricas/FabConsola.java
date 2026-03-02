package Fabricas;
import Globales.EntradasSalidas.Entrada;
import Globales.EntradasSalidas.EntradaConsola;
import Globales.EntradasSalidas.Salida;
import Globales.EntradasSalidas.SalidaConsola;
public class FabConsola implements FabAbstracta{
    public FabConsola(){

    }

    @Override
    public Entrada generarEntrada(){
        Entrada entrada = new EntradaConsola();
        return entrada;
    }

    @Override
    public Salida generarSalida(){
        Salida consola = new SalidaConsola();
        return consola;
    }
}