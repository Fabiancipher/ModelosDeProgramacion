package Fabricas;
import Globales.Operaciones.Multiplicador;
import Globales.Operaciones.Operacion;
public class FabProducto extends FabOperaciones{
    public FabProducto(){

    }
    
    @Override
    public Operacion generarOperacion(){
        return new Multiplicador();
    }
}