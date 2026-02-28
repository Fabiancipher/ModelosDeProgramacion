package Fabricas;
import Operaciones.Operacion;
import Operaciones.Restador;
public class FabRestador extends FabOperaciones{
    public FabRestador(){

    }

    @Override
    public Operacion generarOperacion(){
        return new Restador();
    }
}