package Fabricas;
import Globales.EntradasSalidas.Entrada;
import Globales.EntradasSalidas.EntradaArchivo;
import Globales.EntradasSalidas.Salida;
import Globales.EntradasSalidas.SalidaArchivo;
public class FabArchivo implements FabAbstracta{
    public FabArchivo(){

    }

    @Override
    public Entrada generarEntrada(){
        Entrada entrada = new EntradaArchivo();
        return entrada;
    }

    @Override
    public Salida generarSalida(){
        Salida escritor = new SalidaArchivo();
        return escritor;
    }
}