package Fabricas;
import EntradasSalidas.Entrada;
import EntradasSalidas.EntradaArchivo;
import EntradasSalidas.Salida;
import EntradasSalidas.SalidaArchivo;
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