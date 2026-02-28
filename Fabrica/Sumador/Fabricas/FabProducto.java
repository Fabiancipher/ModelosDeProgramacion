package Fabricas;
import Operaciones.Multiplicador;
import Operaciones.Operacion;
public class FabProducto extends FabOperaciones{
    public FabProducto(){

    }
    
    @Override
    public Operacion generarOperacion(){
        return new Multiplicador();
    }
}