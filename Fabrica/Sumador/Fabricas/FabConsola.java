package Fabricas;
import EntradasSalidas.Entrada;
import EntradasSalidas.EntradaConsola;
import EntradasSalidas.Salida;
import EntradasSalidas.SalidaConsola;
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