package Fabricas;
import Operaciones.Operacion;
import Operaciones.Sumador;
public class FabSumador extends FabOperaciones{
    public FabSumador(){

    }

    @Override
    public Operacion generarOperacion(){
        return new Sumador();
    }
}