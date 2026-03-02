package Fabricas;
import Globales.Operaciones.Operacion;
import Globales.Operaciones.Restador;
public class FabRestador extends FabOperaciones{
    public FabRestador(){

    }

    @Override
    public Operacion generarOperacion(){
        return new Restador();
    }
}